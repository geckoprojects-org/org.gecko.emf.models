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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversion To Preferred Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The inherited attribute uom references the preferred unit that this conversion applies to. The conversion of a unit to the preferred unit for this physical quantity type is specified by an arithmetic conversion (scaling and/or offset). The content model extends gml:UnitOfMeasureType, which has a mandatory attribute uom which identifies the preferred unit for the physical quantity type that this conversion applies to. The conversion is specified by a choice of 
 * -	gml:factor, which defines the scale factor, or
 * -	gml:formula, which defines a formula 
 * by which a value using the conventional unit of measure can be converted to obtain the corresponding value using the preferred unit of measure.  
 * The formula defines the parameters of a simple formula by which a value using the conventional unit of measure can be converted to the corresponding value using the preferred unit of measure. The formula element contains elements a, b, c and d, whose values use the XML Schema type double. These values are used in the formula y = (a + bx) / (c + dx), where x is a value using this unit, and y is the corresponding value using the base unit. The elements a and d are optional, and if values are not provided, those parameters are considered to be zero. If values are not provided for both a and d, the formula is equivalent to a fraction with numerator and denominator parameters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.ConversionToPreferredUnitType#getFactor <em>Factor</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ConversionToPreferredUnitType#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getConversionToPreferredUnitType()
 * @model extendedMetaData="name='ConversionToPreferredUnitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConversionToPreferredUnitType extends UnitOfMeasureType {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #isSetFactor()
	 * @see #unsetFactor()
	 * @see #setFactor(double)
	 * @see net.opengis.gml.gml.GMLPackage#getConversionToPreferredUnitType_Factor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='factor' namespace='##targetNamespace'"
	 * @generated
	 */
	double getFactor();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ConversionToPreferredUnitType#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #isSetFactor()
	 * @see #unsetFactor()
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml.gml.ConversionToPreferredUnitType#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFactor()
	 * @see #getFactor()
	 * @see #setFactor(double)
	 * @generated
	 */
	void unsetFactor();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml.gml.ConversionToPreferredUnitType#getFactor <em>Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Factor</em>' attribute is set.
	 * @see #unsetFactor()
	 * @see #getFactor()
	 * @see #setFactor(double)
	 * @generated
	 */
	boolean isSetFactor();

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(FormulaType)
	 * @see net.opengis.gml.gml.GMLPackage#getConversionToPreferredUnitType_Formula()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='formula' namespace='##targetNamespace'"
	 * @generated
	 */
	FormulaType getFormula();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ConversionToPreferredUnitType#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(FormulaType value);

} // ConversionToPreferredUnitType
