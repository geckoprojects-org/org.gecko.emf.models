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
package net.opengis.gml.gml;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract General Derived CRS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.AbstractGeneralDerivedCRSType#getConversionGroup <em>Conversion Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AbstractGeneralDerivedCRSType#getConversion <em>Conversion</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getAbstractGeneralDerivedCRSType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractGeneralDerivedCRSType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractGeneralDerivedCRSType extends AbstractCRSType {
	/**
	 * Returns the value of the '<em><b>Conversion Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:conversion is an association role to the coordinate conversion used to define the derived CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractGeneralDerivedCRSType_ConversionGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='conversion:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getConversionGroup();

	/**
	 * Returns the value of the '<em><b>Conversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:conversion is an association role to the coordinate conversion used to define the derived CRS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion</em>' containment reference.
	 * @see #setConversion(GeneralConversionPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractGeneralDerivedCRSType_Conversion()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conversion' namespace='##targetNamespace' group='conversion:group'"
	 * @generated
	 */
	GeneralConversionPropertyType getConversion();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractGeneralDerivedCRSType#getConversion <em>Conversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion</em>' containment reference.
	 * @see #getConversion()
	 * @generated
	 */
	void setConversion(GeneralConversionPropertyType value);

} // AbstractGeneralDerivedCRSType
