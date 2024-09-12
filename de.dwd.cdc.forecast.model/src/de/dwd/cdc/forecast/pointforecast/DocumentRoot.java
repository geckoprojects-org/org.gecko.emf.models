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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.DocumentRoot#getForecast <em>Forecast</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.DocumentRoot#getProductDefinition <em>Product Definition</em>}</li>
 * </ul>
 *
 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Forecast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast</em>' containment reference.
	 * @see #setForecast(ForecastType)
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getDocumentRoot_Forecast()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Forecast' namespace='##targetNamespace'"
	 * @generated
	 */
	ForecastType getForecast();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.forecast.pointforecast.DocumentRoot#getForecast <em>Forecast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast</em>' containment reference.
	 * @see #getForecast()
	 * @generated
	 */
	void setForecast(ForecastType value);

	/**
	 * Returns the value of the '<em><b>Product Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Definition</em>' containment reference.
	 * @see #setProductDefinition(ProductDefinitionType)
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getDocumentRoot_ProductDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProductDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductDefinitionType getProductDefinition();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.forecast.pointforecast.DocumentRoot#getProductDefinition <em>Product Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Definition</em>' containment reference.
	 * @see #getProductDefinition()
	 * @generated
	 */
	void setProductDefinition(ProductDefinitionType value);

} // DocumentRoot
