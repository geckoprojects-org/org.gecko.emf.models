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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conventional Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.ConventionalUnitType#getConversionToPreferredUnit <em>Conversion To Preferred Unit</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ConventionalUnitType#getRoughConversionToPreferredUnit <em>Rough Conversion To Preferred Unit</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ConventionalUnitType#getDerivationUnitTerm <em>Derivation Unit Term</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getConventionalUnitType()
 * @model extendedMetaData="name='ConventionalUnitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConventionalUnitType extends UnitDefinitionType {
	/**
	 * Returns the value of the '<em><b>Conversion To Preferred Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elements gml:conversionToPreferredUnit and gml:roughConversionToPreferredUnit represent parameters used to convert conventional units to preferred units for this physical quantity type.  A preferred unit is either a Base Unit or a Derived Unit that is selected for all values of one physical quantity type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conversion To Preferred Unit</em>' containment reference.
	 * @see #setConversionToPreferredUnit(ConversionToPreferredUnitType)
	 * @see net.opengis.gml.gml.GMLPackage#getConventionalUnitType_ConversionToPreferredUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conversionToPreferredUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	ConversionToPreferredUnitType getConversionToPreferredUnit();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ConventionalUnitType#getConversionToPreferredUnit <em>Conversion To Preferred Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion To Preferred Unit</em>' containment reference.
	 * @see #getConversionToPreferredUnit()
	 * @generated
	 */
	void setConversionToPreferredUnit(ConversionToPreferredUnitType value);

	/**
	 * Returns the value of the '<em><b>Rough Conversion To Preferred Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elements gml:conversionToPreferredUnit and gml:roughConversionToPreferredUnit represent parameters used to convert conventional units to preferred units for this physical quantity type.  A preferred unit is either a Base Unit or a Derived Unit that is selected for all values of one physical quantity type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rough Conversion To Preferred Unit</em>' containment reference.
	 * @see #setRoughConversionToPreferredUnit(ConversionToPreferredUnitType)
	 * @see net.opengis.gml.gml.GMLPackage#getConventionalUnitType_RoughConversionToPreferredUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='roughConversionToPreferredUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	ConversionToPreferredUnitType getRoughConversionToPreferredUnit();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ConventionalUnitType#getRoughConversionToPreferredUnit <em>Rough Conversion To Preferred Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rough Conversion To Preferred Unit</em>' containment reference.
	 * @see #getRoughConversionToPreferredUnit()
	 * @generated
	 */
	void setRoughConversionToPreferredUnit(ConversionToPreferredUnitType value);

	/**
	 * Returns the value of the '<em><b>Derivation Unit Term</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.DerivationUnitTermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of gml:derivationUnitTerm elements describes a derived unit of measure.  Each element carries an integer exponent.  The terms are combined by raising each referenced unit to the power of its exponent and forming the product.
	 * This unit term references another unit of measure (uom) and provides an integer exponent applied to that unit in defining the compound unit. The exponent may be positive or negative, but not zero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation Unit Term</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getConventionalUnitType_DerivationUnitTerm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='derivationUnitTerm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DerivationUnitTermType> getDerivationUnitTerm();

} // ConventionalUnitType
