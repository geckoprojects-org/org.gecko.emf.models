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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Curve Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A discrete coverage type whose domain is defined by a collection of curves.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.MultiCurveCoverageType#getMultiCurveDomain <em>Multi Curve Domain</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getMultiCurveCoverageType()
 * @model extendedMetaData="name='MultiCurveCoverageType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MultiCurveCoverageType extends AbstractDiscreteCoverageType {
	/**
	 * Returns the value of the '<em><b>Multi Curve Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Curve Domain</em>' containment reference.
	 * @see #setMultiCurveDomain(MultiCurveDomainType)
	 * @see net.opengis.gml.GMLPackage#getMultiCurveCoverageType_MultiCurveDomain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='multiCurveDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurveDomainType getMultiCurveDomain();

	/**
	 * Sets the value of the '{@link net.opengis.gml.MultiCurveCoverageType#getMultiCurveDomain <em>Multi Curve Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Curve Domain</em>' containment reference.
	 * @see #getMultiCurveDomain()
	 * @generated
	 */
	void setMultiCurveDomain(MultiCurveDomainType value);

} // MultiCurveCoverageType
