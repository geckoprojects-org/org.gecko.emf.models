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
 * A representation of the model object '<em><b>Perpendicular Offset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.PerpendicularOffsetType#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPerpendicularOffsetType()
 * @model extendedMetaData="name='PerpendicularOffsetType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PerpendicularOffsetType extends PlacementRuleType {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maß der Verschiebung bei PerpendicularOffset.
	 * 
	 * Einheit ist die durch "mapLengthFactor" vorgegebene (Default mm/100).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #isSetDistance()
	 * @see #unsetDistance()
	 * @see #setDistance(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getPerpendicularOffsetType_Distance()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='distance' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PerpendicularOffsetType#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #isSetDistance()
	 * @see #unsetDistance()
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PerpendicularOffsetType#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistance()
	 * @see #getDistance()
	 * @see #setDistance(double)
	 * @generated
	 */
	void unsetDistance();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PerpendicularOffsetType#getDistance <em>Distance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance</em>' attribute is set.
	 * @see #unsetDistance()
	 * @see #getDistance()
	 * @see #setDistance(double)
	 * @generated
	 */
	boolean isSetDistance();

} // PerpendicularOffsetType
