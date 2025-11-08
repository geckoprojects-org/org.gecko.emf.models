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
package org.cyclonedx.schema.bom;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Co2 Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 A measure of carbon dioxide (CO2).
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.Co2MeasureType#getValue <em>Value</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.Co2MeasureType#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getCo2MeasureType()
 * @model extendedMetaData="name='co2MeasureType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Co2MeasureType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Quantity of carbon dioxide (CO2).
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCo2MeasureType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Co2MeasureType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.UnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Unit of carbon dioxide (CO2).
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.cyclonedx.schema.bom.UnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(UnitType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCo2MeasureType_Unit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType getUnit();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.Co2MeasureType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.cyclonedx.schema.bom.UnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.Co2MeasureType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(UnitType)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.Co2MeasureType#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(UnitType)
	 * @generated
	 */
	boolean isSetUnit();

} // Co2MeasureType
