package com.reactnativenavigation.views;

import com.reactnativenavigation.BaseTest;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TopBarTest extends BaseTest {
	@Test
	public void title() throws Exception {
		TopBar topBar = new TopBar(newActivity());
		assertThat(topBar.getTitle()).isEmpty();

		topBar.setTitle("new title");
		assertThat(topBar.getTitle()).isEqualTo("new title");
	}
}
