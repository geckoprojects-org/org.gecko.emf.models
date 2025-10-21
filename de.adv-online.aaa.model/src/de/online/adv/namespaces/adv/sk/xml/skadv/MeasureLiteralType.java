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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Literal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.MeasureLiteralType#getUom <em>Uom</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getMeasureLiteralType()
 * @model extendedMetaData="name='MeasureLiteralType' kind='empty'"
 * @generated
 */
@ProviderType
public interface MeasureLiteralType extends LiteralType {
	/**
	 * Returns the value of the '<em><b>Uom</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.UnitOfMeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maßeinheit nach Aufzählungstyp.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uom</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.UnitOfMeasureType
	 * @see #isSetUom()
	 * @see #unsetUom()
	 * @see #setUom(UnitOfMeasureType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getMeasureLiteralType_Uom()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='uom'"
	 * @generated
	 */
	UnitOfMeasureType getUom();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.MeasureLiteralType#getUom <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.UnitOfMeasureType
	 * @see #isSetUom()
	 * @see #unsetUom()
	 * @see #getUom()
	 * @generated
	 */
	void setUom(UnitOfMeasureType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.MeasureLiteralType#getUom <em>Uom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUom()
	 * @see #getUom()
	 * @see #setUom(UnitOfMeasureType)
	 * @generated
	 */
	void unsetUom();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.MeasureLiteralType#getUom <em>Uom</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Uom</em>' attribute is set.
	 * @see #unsetUom()
	 * @see #getUom()
	 * @see #setUom(UnitOfMeasureType)
	 * @generated
	 */
	boolean isSetUom();

} // MeasureLiteralType
