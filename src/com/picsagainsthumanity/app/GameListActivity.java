package com.picsagainsthumanity.app;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class GameListActivity extends Activity {
	ActionBar.Tab[] tab = new ActionBar.Tab[4];
	Fragment[] fragmentTabs = new Fragment[4];

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		fragmentTabs[0] = new TabFragmentGames();
		fragmentTabs[1] = new TabFragmentAddFriend();
		fragmentTabs[2] = new TabFragmentOptions();
		fragmentTabs[3] = new TabFragmentLogout();

		setContentView(R.layout.activity_game_list);

		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		tab[0] = actionBar.newTab().setText(getString(R.string.tab_name_games));
		tab[1] = actionBar.newTab().setText(
				getString(R.string.tab_name_add_friend));
		tab[2] = actionBar.newTab().setText(
				getString(R.string.tab_name_options));
		tab[3] = actionBar.newTab()
				.setText(getString(R.string.tab_name_logout));

		for (int i = 0; i < 4; i++) {
			tab[i].setTabListener(new GameListTabListener(fragmentTabs[i]));
			actionBar.addTab(tab[i]);
		}
	}
}
