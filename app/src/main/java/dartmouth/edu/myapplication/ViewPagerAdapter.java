package dartmouth.edu.myapplication;

import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by zohaibakmal on 2/10/2015.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                HomeTab homeTab = new HomeTab();
                return homeTab;
            case 1:
                AddNewAthleteTab addNewAthleteTab = new AddNewAthleteTab();
                return addNewAthleteTab;
            case 2:
                ExistingAthleteTab existingAthleteTab = new ExistingAthleteTab();
                return existingAthleteTab;
            case 3:
                ScienceTab scienceTab = new ScienceTab();
                return scienceTab;
            default:
                System.out.println("Invalid position passed");
                return null;
        }

    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}