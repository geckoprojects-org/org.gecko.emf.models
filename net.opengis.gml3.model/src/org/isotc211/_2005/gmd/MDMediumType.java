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
import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.RealPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Medium Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about the media on which the data can be distributed
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDMediumType#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMediumType#getDensity <em>Density</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMediumType#getDensityUnits <em>Density Units</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMediumType#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMediumType#getMediumFormat <em>Medium Format</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMediumType#getMediumNote <em>Medium Note</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDMediumType()
 * @model extendedMetaData="name='MD_Medium_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDMediumType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(MDMediumNameCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMediumType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	MDMediumNameCodePropertyType getName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMediumType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(MDMediumNameCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Density</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.RealPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Density</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMediumType_Density()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='density' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RealPropertyType> getDensity();

	/**
	 * Returns the value of the '<em><b>Density Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Density Units</em>' containment reference.
	 * @see #setDensityUnits(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMediumType_DensityUnits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='densityUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getDensityUnits();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMediumType#getDensityUnits <em>Density Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Density Units</em>' containment reference.
	 * @see #getDensityUnits()
	 * @generated
	 */
	void setDensityUnits(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference.
	 * @see #setVolumes(IntegerPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMediumType_Volumes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='volumes' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerPropertyType getVolumes();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMediumType#getVolumes <em>Volumes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volumes</em>' containment reference.
	 * @see #getVolumes()
	 * @generated
	 */
	void setVolumes(IntegerPropertyType value);

	/**
	 * Returns the value of the '<em><b>Medium Format</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDMediumFormatCodePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Format</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMediumType_MediumFormat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mediumFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDMediumFormatCodePropertyType> getMediumFormat();

	/**
	 * Returns the value of the '<em><b>Medium Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Note</em>' containment reference.
	 * @see #setMediumNote(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMediumType_MediumNote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mediumNote' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getMediumNote();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMediumType#getMediumNote <em>Medium Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium Note</em>' containment reference.
	 * @see #getMediumNote()
	 * @generated
	 */
	void setMediumNote(CharacterStringPropertyType value);

} // MDMediumType
