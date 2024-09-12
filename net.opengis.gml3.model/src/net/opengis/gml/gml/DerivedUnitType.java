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
 * A representation of the model object '<em><b>Derived Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.DerivedUnitType#getDerivationUnitTerm <em>Derivation Unit Term</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getDerivedUnitType()
 * @model extendedMetaData="name='DerivedUnitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DerivedUnitType extends UnitDefinitionType {
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
	 * @see net.opengis.gml.gml.GMLPackage#getDerivedUnitType_DerivationUnitTerm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='derivationUnitTerm' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DerivationUnitTermType> getDerivationUnitTerm();

} // DerivedUnitType
