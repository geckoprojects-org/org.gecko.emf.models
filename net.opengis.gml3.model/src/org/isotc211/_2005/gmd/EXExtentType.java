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

import org.eclipse.emf.common.util.EList;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EX Extent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about spatial, vertical, and temporal extent
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.EXExtentType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.EXExtentType#getGeographicElement <em>Geographic Element</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.EXExtentType#getTemporalElement <em>Temporal Element</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.EXExtentType#getVerticalElement <em>Vertical Element</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getEXExtentType()
 * @model extendedMetaData="name='EX_Extent_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EXExtentType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getEXExtentType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.EXExtentType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Geographic Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.EXGeographicExtentPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geographic Element</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getEXExtentType_GeographicElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geographicElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EXGeographicExtentPropertyType> getGeographicElement();

	/**
	 * Returns the value of the '<em><b>Temporal Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.EXTemporalExtentPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Element</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getEXExtentType_TemporalElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='temporalElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EXTemporalExtentPropertyType> getTemporalElement();

	/**
	 * Returns the value of the '<em><b>Vertical Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.EXVerticalExtentPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Element</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getEXExtentType_VerticalElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verticalElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EXVerticalExtentPropertyType> getVerticalElement();

} // EXExtentType
