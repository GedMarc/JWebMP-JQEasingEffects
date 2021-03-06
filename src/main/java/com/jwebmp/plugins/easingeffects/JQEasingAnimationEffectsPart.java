/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.easingeffects;

import com.jwebmp.core.generics.Direction;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * This is the universal easing animation object JavaScript part
 * <p>
 *
 * @author MMagon
 * 		<p>
 * 		<p>
 * @version 1.0
 * @since 2014 07 29
 */
public class JQEasingAnimationEffectsPart<J extends JQEasingAnimationEffectsPart<J>>
		extends JavaScriptPart<J>
{


	/**
	 * The easing object
	 */
	private JQEasingEffects easing;
	/**
	 * The duration object
	 */
	private Integer duration;
	/**
	 * The direction object
	 */
	private Direction direction;

	/**
	 * Creates a new instance of the easing javascript options
	 */
	public JQEasingAnimationEffectsPart()
	{
	}

	/**
	 * Construct a new animation effects part using the supplies parameters
	 * <p>
	 *
	 * @param easing
	 * 		The actual animation to apply
	 * @param duration
	 * 		The duration in ms to apply
	 * @param direction
	 * 		The direction in which to apply it
	 */
	public JQEasingAnimationEffectsPart(JQEasingEffects easing, Integer duration, Direction direction)
	{
		this.easing = easing;
		this.duration = duration;
		this.direction = direction;
	}

	/**
	 * Construct a new animation effects part using the supplies parameters
	 * <p>
	 *
	 * @param easing
	 * 		The actual animation to apply
	 */
	public JQEasingAnimationEffectsPart(JQEasingEffects easing)
	{
		this.easing = easing;
	}

	/**
	 * Construct a new animation effects part using the supplies parameters
	 * <p>
	 *
	 * @param easing
	 * 		The actual animation to apply
	 * @param duration
	 * 		The duration in ms to apply
	 */
	public JQEasingAnimationEffectsPart(JQEasingEffects easing, Integer duration)
	{
		this.easing = easing;
		this.duration = duration;
	}

	/**
	 * Returns the animation effect applied
	 * <p>
	 *
	 * @return
	 */
	public JQEasingEffects getEasing()
	{
		return easing;
	}

	/**
	 * Sets the animation effect to apply
	 * <p>
	 *
	 * @param easing
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setEasing(JQEasingEffects easing)
	{
		this.easing = easing;
		return (J) this;
	}

	/**
	 * Gets the duration in ms applied
	 * <p>
	 *
	 * @return
	 */
	public Integer getDuration()
	{
		return duration;
	}

	/**
	 * Sets the duration in ms to apply
	 * <p>
	 *
	 * @param duration
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDuration(Integer duration)
	{
		this.duration = duration;
		return (J) this;
	}

	/**
	 * Gets the direction for the animation to perform
	 * <p>
	 *
	 * @return
	 */
	public Direction getDirection()
	{
		return direction;
	}

	/**
	 * Sets the direction of the animation to perform
	 * <p>
	 *
	 * @param direction
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDirection(Direction direction)
	{
		this.direction = direction;
		return (J) this;
	}
}
