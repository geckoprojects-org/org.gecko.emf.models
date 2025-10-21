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
 * A representation of the model object '<em><b>Area Symbolizer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaSymbolizerType#getInterior <em>Interior</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaSymbolizerType#getBoundary <em>Boundary</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAreaSymbolizerType()
 * @model extendedMetaData="name='AreaSymbolizerType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AreaSymbolizerType extends PureSymbolizerType1 {
	/**
	 * Returns the value of the '<em><b>Interior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Fill-Objekt zur Signaturierung des Flächeninneren.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interior</em>' containment reference.
	 * @see #setInterior(InteriorType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAreaSymbolizerType_Interior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interior' namespace='##targetNamespace'"
	 * @generated
	 */
	InteriorType getInterior();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaSymbolizerType#getInterior <em>Interior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interior</em>' containment reference.
	 * @see #getInterior()
	 * @generated
	 */
	void setInterior(InteriorType value);

	/**
	 * Returns the value of the '<em><b>Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Stroke-Objekt für die Signaturierung des Flächenrands.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boundary</em>' containment reference.
	 * @see #setBoundary(BoundaryType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAreaSymbolizerType_Boundary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundary' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundaryType getBoundary();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaSymbolizerType#getBoundary <em>Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary</em>' containment reference.
	 * @see #getBoundary()
	 * @generated
	 */
	void setBoundary(BoundaryType value);

} // AreaSymbolizerType
