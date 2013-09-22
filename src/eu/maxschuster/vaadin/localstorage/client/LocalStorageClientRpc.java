/*
 * eu.maxschuster.vaadin.localstorage.client.LocalStorageClientRpc.java
 * 
 * Copyright 2013 Max Schuster
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.maxschuster.vaadin.localstorage.client;

import com.vaadin.shared.communication.ClientRpc;

/**
 * Defines client side methods that can get invoked from the server side. 
 * @author Max Schuster <dev@maxschutser.eu>
 */
public interface LocalStorageClientRpc extends ClientRpc {
	
	/**
	 * Sets the data of an item.
	 * @param key Key of the item.
	 * @param data Data of the item.
	 */
	public void setItem(String key, String data);
	
	/**
	 * Removes the item.
	 * @param key Key of the item.
	 */
	public void removeItem(String key);
	
	/**
	 * Clears the entire storage.
	 */
	public void clear();
	
	/**
	 * Triggers a full refresh of the server side mirror of localStorage.
	 */
	public void refresh();
	
}
