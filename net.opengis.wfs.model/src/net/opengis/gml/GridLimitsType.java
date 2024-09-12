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
 * A representation of the model object '<em><b>Grid Limits Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.GridLimitsType#getGridEnvelope <em>Grid Envelope</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getGridLimitsType()
 * @model extendedMetaData="name='GridLimitsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GridLimitsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Grid Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Envelope</em>' containment reference.
	 * @see #setGridEnvelope(GridEnvelopeType)
	 * @see net.opengis.gml.GMLPackage#getGridLimitsType_GridEnvelope()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GridEnvelope' namespace='##targetNamespace'"
	 * @generated
	 */
	GridEnvelopeType getGridEnvelope();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GridLimitsType#getGridEnvelope <em>Grid Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Envelope</em>' containment reference.
	 * @see #getGridEnvelope()
	 * @generated
	 */
	void setGridEnvelope(GridEnvelopeType value);

} // GridLimitsType
