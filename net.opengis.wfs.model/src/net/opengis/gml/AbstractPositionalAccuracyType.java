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
package net.opengis.gml;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Positional Accuracy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Position error estimate (or accuracy) data. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.AbstractPositionalAccuracyType#getMeasureDescription <em>Measure Description</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getAbstractPositionalAccuracyType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractPositionalAccuracyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractPositionalAccuracyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Measure Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the position accuracy parameter(s) provided. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Description</em>' containment reference.
	 * @see #setMeasureDescription(CodeType)
	 * @see net.opengis.gml.GMLPackage#getAbstractPositionalAccuracyType_MeasureDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getMeasureDescription();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractPositionalAccuracyType#getMeasureDescription <em>Measure Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Description</em>' containment reference.
	 * @see #getMeasureDescription()
	 * @generated
	 */
	void setMeasureDescription(CodeType value);

} // AbstractPositionalAccuracyType
