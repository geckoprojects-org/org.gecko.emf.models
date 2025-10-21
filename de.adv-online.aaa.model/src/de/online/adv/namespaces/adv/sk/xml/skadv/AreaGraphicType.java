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
 * A representation of the model object '<em><b>Area Graphic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaGraphicType#getInterior <em>Interior</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaGraphicType#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaGraphicType#getGeometry <em>Geometry</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAreaGraphicType()
 * @model extendedMetaData="name='AreaGraphicType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AreaGraphicType extends SimpleGraphicType {
	/**
	 * Returns the value of the '<em><b>Interior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flächenausgabe des Inneren eines AreaGraphic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interior</em>' containment reference.
	 * @see #setInterior(InteriorType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAreaGraphicType_Interior()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interior' namespace='##targetNamespace'"
	 * @generated
	 */
	InteriorType1 getInterior();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaGraphicType#getInterior <em>Interior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interior</em>' containment reference.
	 * @see #getInterior()
	 * @generated
	 */
	void setInterior(InteriorType1 value);

	/**
	 * Returns the value of the '<em><b>Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linienausgabe des Rands eines AreaGraphic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boundary</em>' containment reference.
	 * @see #setBoundary(BoundaryType2)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAreaGraphicType_Boundary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundary' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundaryType2 getBoundary();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaGraphicType#getBoundary <em>Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary</em>' containment reference.
	 * @see #getBoundary()
	 * @generated
	 */
	void setBoundary(BoundaryType2 value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(GeometryType2)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getAreaGraphicType_Geometry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryType2 getGeometry();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaGraphicType#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(GeometryType2 value);

} // AreaGraphicType
