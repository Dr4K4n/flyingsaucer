/*
 *
 * Document.java
 * Copyright (c) 2004 Torbj�rn Gannholm
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 */

package org.xhtmlrenderer.extend;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xhtmlrenderer.css.sheet.InlineStyleInfo;
import org.xhtmlrenderer.css.sheet.StylesheetInfo;
import org.xhtmlrenderer.layout.Context;

import javax.swing.*;

/**
 * Provides knowledge specific to a certain document type, like resolving style-sheets
 */
public interface NamespaceHandler {

    //javax.xml.transform.Source getSource();

    /**
     * @return the namespace handled
     */
    public String getNamespace();

    /**
     * @return the default CSS stylesheet for this namespace
     */
    public java.io.Reader getDefaultStylesheet();

    /**
     * @param doc
     * @return the title for this document, if any exists
     */
    public String getDocumentTitle(Document doc);

    /**
     * @param doc
     * @return all CSS styles (type="text/css") defined inline in this document
     */
    public InlineStyleInfo[] getInlineStyle(Document doc);

    /**
     * @param doc
     * @return all links to CSS stylesheets (type="text/css") in this document
     */
    public StylesheetInfo[] getStylesheetLinks(Document doc);
    
    /** may return null */
    //public String getClass(org.w3c.dom.Element e);
    
    /** may return null */
    //public String getID(org.w3c.dom.Element e);
    
    /** may return null */
    //public String getElementStyling(org.w3c.dom.Element e);
    
    /** may return null */
    //public String getLang(org.w3c.dom.Element e);

    /**
     * @param e
     * @param c
     * @return null if no custom component, else the custom component to draw in place of this element and its descendants.
     */
    public JComponent getCustomComponent(Element e, Context c);

}
