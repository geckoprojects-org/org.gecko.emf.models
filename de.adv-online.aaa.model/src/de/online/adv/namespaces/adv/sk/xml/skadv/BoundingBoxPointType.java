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
 * A representation of the model object '<em><b>Bounding Box Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointType#getBoxPositionX <em>Box Position X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointType#getBoxPositionY <em>Box Position Y</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getBoundingBoxPointType()
 * @model extendedMetaData="name='BoundingBoxPointType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BoundingBoxPointType extends PlacementRuleType {
	/**
	 * Returns the value of the '<em><b>Box Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auswahl  in X-Richtung. 0 bedeutet links, 1 bedeutet rechts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Box Position X</em>' attribute.
	 * @see #isSetBoxPositionX()
	 * @see #unsetBoxPositionX()
	 * @see #setBoxPositionX(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getBoundingBoxPointType_BoxPositionX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='boxPositionX' namespace='##targetNamespace'"
	 * @generated
	 */
	double getBoxPositionX();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointType#getBoxPositionX <em>Box Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Position X</em>' attribute.
	 * @see #isSetBoxPositionX()
	 * @see #unsetBoxPositionX()
	 * @see #getBoxPositionX()
	 * @generated
	 */
	void setBoxPositionX(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointType#getBoxPositionX <em>Box Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxPositionX()
	 * @see #getBoxPositionX()
	 * @see #setBoxPositionX(double)
	 * @generated
	 */
	void unsetBoxPositionX();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointType#getBoxPositionX <em>Box Position X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Position X</em>' attribute is set.
	 * @see #unsetBoxPositionX()
	 * @see #getBoxPositionX()
	 * @see #setBoxPositionX(double)
	 * @generated
	 */
	boolean isSetBoxPositionX();

	/**
	 * Returns the value of the '<em><b>Box Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auswahl in Y-Richtung. 0 bedeutet unten, 1 bedeutet oben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Box Position Y</em>' attribute.
	 * @see #isSetBoxPositionY()
	 * @see #unsetBoxPositionY()
	 * @see #setBoxPositionY(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getBoundingBoxPointType_BoxPositionY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='boxPositionY' namespace='##targetNamespace'"
	 * @generated
	 */
	double getBoxPositionY();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointType#getBoxPositionY <em>Box Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Position Y</em>' attribute.
	 * @see #isSetBoxPositionY()
	 * @see #unsetBoxPositionY()
	 * @see #getBoxPositionY()
	 * @generated
	 */
	void setBoxPositionY(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointType#getBoxPositionY <em>Box Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxPositionY()
	 * @see #getBoxPositionY()
	 * @see #setBoxPositionY(double)
	 * @generated
	 */
	void unsetBoxPositionY();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointType#getBoxPositionY <em>Box Position Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Position Y</em>' attribute is set.
	 * @see #unsetBoxPositionY()
	 * @see #getBoxPositionY()
	 * @see #setBoxPositionY(double)
	 * @generated
	 */
	boolean isSetBoxPositionY();

} // BoundingBoxPointType
