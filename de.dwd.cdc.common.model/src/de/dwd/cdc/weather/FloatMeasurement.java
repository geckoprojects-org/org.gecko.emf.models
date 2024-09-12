/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package de.dwd.cdc.weather;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.weather.FloatMeasurement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.dwd.cdc.weather.WeatherPackage#getFloatMeasurement()
 * @model
 * @generated
 */
@ProviderType
public interface FloatMeasurement extends Measurement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see de.dwd.cdc.weather.WeatherPackage#getFloatMeasurement_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.weather.FloatMeasurement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // FloatMeasurement
