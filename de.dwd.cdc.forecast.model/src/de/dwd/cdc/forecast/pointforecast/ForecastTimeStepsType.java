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
package de.dwd.cdc.forecast.pointforecast;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forecast Time Steps Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.ForecastTimeStepsType#getTimeStep <em>Time Step</em>}</li>
 * </ul>
 *
 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getForecastTimeStepsType()
 * @model extendedMetaData="name='ForecastTimeSteps_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ForecastTimeStepsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Step</b></em>' attribute list.
	 * The list contents are of type {@link javax.xml.datatype.XMLGregorianCalendar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Step</em>' attribute list.
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getForecastTimeStepsType_TimeStep()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='TimeStep' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XMLGregorianCalendar> getTimeStep();

} // ForecastTimeStepsType
