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
 * A representation of the model object '<em><b>Style Variation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to vary individual graphic parameters and attributes of the style, symbol or text.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.StyleVariationType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.gml.StyleVariationType#getFeaturePropertyRange <em>Feature Property Range</em>}</li>
 *   <li>{@link net.opengis.gml.StyleVariationType#getStyleProperty <em>Style Property</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getStyleVariationType()
 * @model extendedMetaData="name='StyleVariationType' kind='simple'"
 * @generated
 */
@ProviderType
public interface StyleVariationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.opengis.gml.GMLPackage#getStyleVariationType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.opengis.gml.StyleVariationType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Feature Property Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Property Range</em>' attribute.
	 * @see #setFeaturePropertyRange(String)
	 * @see net.opengis.gml.GMLPackage#getStyleVariationType_FeaturePropertyRange()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='featurePropertyRange'"
	 * @generated
	 */
	String getFeaturePropertyRange();

	/**
	 * Sets the value of the '{@link net.opengis.gml.StyleVariationType#getFeaturePropertyRange <em>Feature Property Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Property Range</em>' attribute.
	 * @see #getFeaturePropertyRange()
	 * @generated
	 */
	void setFeaturePropertyRange(String value);

	/**
	 * Returns the value of the '<em><b>Style Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Property</em>' attribute.
	 * @see #setStyleProperty(String)
	 * @see net.opengis.gml.GMLPackage#getStyleVariationType_StyleProperty()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='styleProperty'"
	 * @generated
	 */
	String getStyleProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.StyleVariationType#getStyleProperty <em>Style Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Property</em>' attribute.
	 * @see #getStyleProperty()
	 * @generated
	 */
	void setStyleProperty(String value);

} // StyleVariationType
