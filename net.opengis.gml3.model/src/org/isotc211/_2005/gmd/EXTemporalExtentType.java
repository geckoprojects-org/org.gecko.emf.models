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
package org.isotc211._2005.gmd;

import org.isotc211._2005.gco.AbstractObjectType;

import org.isotc211._2005.gts.TMPrimitivePropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EX Temporal Extent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Time period covered by the content of the dataset
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.EXTemporalExtentType#getExtent <em>Extent</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getEXTemporalExtentType()
 * @model extendedMetaData="name='EX_TemporalExtent_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EXTemporalExtentType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference.
	 * @see #setExtent(TMPrimitivePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getEXTemporalExtentType_Extent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='extent' namespace='##targetNamespace'"
	 * @generated
	 */
	TMPrimitivePropertyType getExtent();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.EXTemporalExtentType#getExtent <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' containment reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(TMPrimitivePropertyType value);

} // EXTemporalExtentType
