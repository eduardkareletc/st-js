/**
 *  Copyright 2011 Alexandru Craciun, Eyal Kaspi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"){throw new UnsupportedOperationException();}
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.stjs.javascript.dom;

abstract public class Element extends Node {
	public String className;
	public String dir;
	public String id;
	public String lang;
	public String title;
	public String tagName;
	public String innerHTML;

	public String getAttribute(String name) {
		throw new UnsupportedOperationException();
	}

	public Attr getAttributeNode(String name) {
		throw new UnsupportedOperationException();
	}

	// public getAttributeNodeNS(String, String)
	// public getAttributeNS(String, String)
	public HTMLList<Element> getElementsByTagName(String tag) {
		throw new UnsupportedOperationException();
	}

	// public getElementsByTagNameNS(String, String)
	// public getSchemaTypeInfo()

	public boolean hasAttribute(String name) {
		throw new UnsupportedOperationException();
	}

	// public hasAttributeNS(String, String)
	public void removeAttribute(String name) {
		throw new UnsupportedOperationException();
	}

	public void removeAttributeNode(Attr att) {
		throw new UnsupportedOperationException();
	}

	// public removeAttributeNS(String, String)
	public void setAttribute(String name, String value) {
		throw new UnsupportedOperationException();
	}

	public void setAttributeNode(Attr name) {
		throw new UnsupportedOperationException();
	}

	// public setAttributeNodeNS(Attr)
	// public setAttributeNS(String, String, String)
	public void setIdAttribute(String name, boolean id) {
		throw new UnsupportedOperationException();
	}

	public void setIdAttributeNode(Attr attr, boolean id) {
		throw new UnsupportedOperationException();
	}

	// public setIdAttributeNS(String, String, boolean)

}