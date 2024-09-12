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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getProductID <em>Product ID</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getGeneratingProcess <em>Generating Process</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getIssueTime <em>Issue Time</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getReferencedModel <em>Referenced Model</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getForecastTimeSteps <em>Forecast Time Steps</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getFormatCfg <em>Format Cfg</em>}</li>
 *   <li>{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getMetElementDefinition <em>Met Element Definition</em>}</li>
 * </ul>
 *
 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getProductDefinitionType()
 * @model extendedMetaData="name='ProductDefinition_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ProductDefinitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer</em>' attribute.
	 * @see #setIssuer(String)
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getProductDefinitionType_Issuer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Issuer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIssuer();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getIssuer <em>Issuer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' attribute.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(String value);

	/**
	 * Returns the value of the '<em><b>Product ID</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dwd.cdc.forecast.pointforecast.ProductIDType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identification tag for this product, indicating the meteorological application and perhaps also the data, that was utilized for generation of this product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product ID</em>' attribute.
	 * @see de.dwd.cdc.forecast.pointforecast.ProductIDType
	 * @see #isSetProductID()
	 * @see #unsetProductID()
	 * @see #setProductID(ProductIDType)
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getProductDefinitionType_ProductID()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ProductID' namespace='##targetNamespace'"
	 * @generated
	 */
	ProductIDType getProductID();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getProductID <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product ID</em>' attribute.
	 * @see de.dwd.cdc.forecast.pointforecast.ProductIDType
	 * @see #isSetProductID()
	 * @see #unsetProductID()
	 * @see #getProductID()
	 * @generated
	 */
	void setProductID(ProductIDType value);

	/**
	 * Unsets the value of the '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getProductID <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProductID()
	 * @see #getProductID()
	 * @see #setProductID(ProductIDType)
	 * @generated
	 */
	void unsetProductID();

	/**
	 * Returns whether the value of the '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getProductID <em>Product ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Product ID</em>' attribute is set.
	 * @see #unsetProductID()
	 * @see #getProductID()
	 * @see #setProductID(ProductIDType)
	 * @generated
	 */
	boolean isSetProductID();

	/**
	 * Returns the value of the '<em><b>Generating Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed information about the meteorological application, that was used for generating this product
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generating Process</em>' attribute.
	 * @see #setGeneratingProcess(String)
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getProductDefinitionType_GeneratingProcess()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='GeneratingProcess' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGeneratingProcess();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getGeneratingProcess <em>Generating Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generating Process</em>' attribute.
	 * @see #getGeneratingProcess()
	 * @generated
	 */
	void setGeneratingProcess(String value);

	/**
	 * Returns the value of the '<em><b>Issue Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modelrun or issue time for this product. The timepoint, at which the meteorological application was executed to generate this product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Time</em>' attribute.
	 * @see #setIssueTime(XMLGregorianCalendar)
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getProductDefinitionType_IssueTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='IssueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getIssueTime();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getIssueTime <em>Issue Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Time</em>' attribute.
	 * @see #getIssueTime()
	 * @generated
	 */
	void setIssueTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Referenced Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the meteorological application responsible for this product used NWP-Modeldata, it shall list its utilized NWP-Models with their respective Modelruns. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Model</em>' containment reference.
	 * @see #setReferencedModel(ReferencedModelType)
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getProductDefinitionType_ReferencedModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ReferencedModel' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferencedModelType getReferencedModel();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getReferencedModel <em>Referenced Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Model</em>' containment reference.
	 * @see #getReferencedModel()
	 * @generated
	 */
	void setReferencedModel(ReferencedModelType value);

	/**
	 * Returns the value of the '<em><b>Forecast Time Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Forecast Timesteps contained in this product
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Forecast Time Steps</em>' containment reference.
	 * @see #setForecastTimeSteps(ForecastTimeStepsType)
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getProductDefinitionType_ForecastTimeSteps()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ForecastTimeSteps' namespace='##targetNamespace'"
	 * @generated
	 */
	ForecastTimeStepsType getForecastTimeSteps();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getForecastTimeSteps <em>Forecast Time Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast Time Steps</em>' containment reference.
	 * @see #getForecastTimeSteps()
	 * @generated
	 */
	void setForecastTimeSteps(ForecastTimeStepsType value);

	/**
	 * Returns the value of the '<em><b>Format Cfg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Cfg</em>' containment reference.
	 * @see #setFormatCfg(FormatCfgType)
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getProductDefinitionType_FormatCfg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FormatCfg' namespace='##targetNamespace'"
	 * @generated
	 */
	FormatCfgType getFormatCfg();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getFormatCfg <em>Format Cfg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Cfg</em>' containment reference.
	 * @see #getFormatCfg()
	 * @generated
	 */
	void setFormatCfg(FormatCfgType value);

	/**
	 * Returns the value of the '<em><b>Met Element Definition</b></em>' attribute.
	 * The default value is <code>"https://opendata.dwd.de/weather/lib/MetElementDefinition.xml"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Met Element Definition</em>' attribute.
	 * @see #isSetMetElementDefinition()
	 * @see #unsetMetElementDefinition()
	 * @see #setMetElementDefinition(String)
	 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage#getProductDefinitionType_MetElementDefinition()
	 * @model default="https://opendata.dwd.de/weather/lib/MetElementDefinition.xml" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='MetElementDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMetElementDefinition();

	/**
	 * Sets the value of the '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getMetElementDefinition <em>Met Element Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Met Element Definition</em>' attribute.
	 * @see #isSetMetElementDefinition()
	 * @see #unsetMetElementDefinition()
	 * @see #getMetElementDefinition()
	 * @generated
	 */
	void setMetElementDefinition(String value);

	/**
	 * Unsets the value of the '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getMetElementDefinition <em>Met Element Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMetElementDefinition()
	 * @see #getMetElementDefinition()
	 * @see #setMetElementDefinition(String)
	 * @generated
	 */
	void unsetMetElementDefinition();

	/**
	 * Returns whether the value of the '{@link de.dwd.cdc.forecast.pointforecast.ProductDefinitionType#getMetElementDefinition <em>Met Element Definition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Met Element Definition</em>' attribute is set.
	 * @see #unsetMetElementDefinition()
	 * @see #getMetElementDefinition()
	 * @see #setMetElementDefinition(String)
	 * @generated
	 */
	boolean isSetMetElementDefinition();

} // ProductDefinitionType
