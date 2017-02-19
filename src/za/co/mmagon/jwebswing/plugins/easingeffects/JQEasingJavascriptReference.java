/*
 * Copyright (C) 2015 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.easingeffects;

import za.co.mmagon.jwebswing.base.references.JavascriptReference;

/**
 *
 * @author GedMarc
 * @since Mar 1, 2015
 * @version 1.0
 * <p>
 *
 */
public class JQEasingJavascriptReference extends JavascriptReference
{

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public JQEasingJavascriptReference()
    {
        super("EasingAnimations", 1.31, "bower_components/jquery-easing/jquery.easing.min.js", "http://gsgd.co.uk/sandbox/jquery/easing/jquery.easing.1.4.js");
    }
}
