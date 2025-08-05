/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package net.opengis.wms;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.DimensionType#getValue <em>Value</em>}</li>
 *   <li>{@link net.opengis.wms.DimensionType#isCurrent <em>Current</em>}</li>
 *   <li>{@link net.opengis.wms.DimensionType#getDefault <em>Default</em>}</li>
 *   <li>{@link net.opengis.wms.DimensionType#isMultipleValues <em>Multiple Values</em>}</li>
 *   <li>{@link net.opengis.wms.DimensionType#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.wms.DimensionType#isNearestValue <em>Nearest Value</em>}</li>
 *   <li>{@link net.opengis.wms.DimensionType#getUnits <em>Units</em>}</li>
 *   <li>{@link net.opengis.wms.DimensionType#getUnitSymbol <em>Unit Symbol</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getDimensionType()
 * @model extendedMetaData="name='Dimension_._type' kind='simple'"
 * @generated
 */
@ProviderType
public interface DimensionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.opengis.wms.WMSPackage#getDimensionType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DimensionType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #isSetCurrent()
	 * @see #unsetCurrent()
	 * @see #setCurrent(boolean)
	 * @see net.opengis.wms.WMSPackage#getDimensionType_Current()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='current'"
	 * @generated
	 */
	boolean isCurrent();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DimensionType#isCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #isSetCurrent()
	 * @see #unsetCurrent()
	 * @see #isCurrent()
	 * @generated
	 */
	void setCurrent(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.DimensionType#isCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrent()
	 * @see #isCurrent()
	 * @see #setCurrent(boolean)
	 * @generated
	 */
	void unsetCurrent();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.DimensionType#isCurrent <em>Current</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current</em>' attribute is set.
	 * @see #unsetCurrent()
	 * @see #isCurrent()
	 * @see #setCurrent(boolean)
	 * @generated
	 */
	boolean isSetCurrent();

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see net.opengis.wms.WMSPackage#getDimensionType_Default()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='default'"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DimensionType#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Multiple Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Values</em>' attribute.
	 * @see #isSetMultipleValues()
	 * @see #unsetMultipleValues()
	 * @see #setMultipleValues(boolean)
	 * @see net.opengis.wms.WMSPackage#getDimensionType_MultipleValues()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='multipleValues'"
	 * @generated
	 */
	boolean isMultipleValues();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DimensionType#isMultipleValues <em>Multiple Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Values</em>' attribute.
	 * @see #isSetMultipleValues()
	 * @see #unsetMultipleValues()
	 * @see #isMultipleValues()
	 * @generated
	 */
	void setMultipleValues(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.DimensionType#isMultipleValues <em>Multiple Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultipleValues()
	 * @see #isMultipleValues()
	 * @see #setMultipleValues(boolean)
	 * @generated
	 */
	void unsetMultipleValues();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.DimensionType#isMultipleValues <em>Multiple Values</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiple Values</em>' attribute is set.
	 * @see #unsetMultipleValues()
	 * @see #isMultipleValues()
	 * @see #setMultipleValues(boolean)
	 * @generated
	 */
	boolean isSetMultipleValues();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.opengis.wms.WMSPackage#getDimensionType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DimensionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nearest Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nearest Value</em>' attribute.
	 * @see #isSetNearestValue()
	 * @see #unsetNearestValue()
	 * @see #setNearestValue(boolean)
	 * @see net.opengis.wms.WMSPackage#getDimensionType_NearestValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='nearestValue'"
	 * @generated
	 */
	boolean isNearestValue();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DimensionType#isNearestValue <em>Nearest Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nearest Value</em>' attribute.
	 * @see #isSetNearestValue()
	 * @see #unsetNearestValue()
	 * @see #isNearestValue()
	 * @generated
	 */
	void setNearestValue(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.wms.DimensionType#isNearestValue <em>Nearest Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNearestValue()
	 * @see #isNearestValue()
	 * @see #setNearestValue(boolean)
	 * @generated
	 */
	void unsetNearestValue();

	/**
	 * Returns whether the value of the '{@link net.opengis.wms.DimensionType#isNearestValue <em>Nearest Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nearest Value</em>' attribute is set.
	 * @see #unsetNearestValue()
	 * @see #isNearestValue()
	 * @see #setNearestValue(boolean)
	 * @generated
	 */
	boolean isSetNearestValue();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see net.opengis.wms.WMSPackage#getDimensionType_Units()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='units'"
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DimensionType#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

	/**
	 * Returns the value of the '<em><b>Unit Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Symbol</em>' attribute.
	 * @see #setUnitSymbol(String)
	 * @see net.opengis.wms.WMSPackage#getDimensionType_UnitSymbol()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unitSymbol'"
	 * @generated
	 */
	String getUnitSymbol();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DimensionType#getUnitSymbol <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Symbol</em>' attribute.
	 * @see #getUnitSymbol()
	 * @generated
	 */
	void setUnitSymbol(String value);

} // DimensionType
