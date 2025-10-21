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
 * A representation of the model object '<em><b>Displacement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementType#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementType#getDisplacementY <em>Displacement Y</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDisplacementType()
 * @model extendedMetaData="name='DisplacementType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DisplacementType extends PlacementRuleType {
	/**
	 * Returns the value of the '<em><b>Displacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verschiebung in X-Richtung. Einheit, wie in "mapLengthFactor" angegeben. Default ist 0.0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Displacement X</em>' attribute.
	 * @see #isSetDisplacementX()
	 * @see #unsetDisplacementX()
	 * @see #setDisplacementX(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDisplacementType_DisplacementX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='displacementX' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDisplacementX();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementType#getDisplacementX <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement X</em>' attribute.
	 * @see #isSetDisplacementX()
	 * @see #unsetDisplacementX()
	 * @see #getDisplacementX()
	 * @generated
	 */
	void setDisplacementX(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementType#getDisplacementX <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementX()
	 * @see #getDisplacementX()
	 * @see #setDisplacementX(double)
	 * @generated
	 */
	void unsetDisplacementX();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementType#getDisplacementX <em>Displacement X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Displacement X</em>' attribute is set.
	 * @see #unsetDisplacementX()
	 * @see #getDisplacementX()
	 * @see #setDisplacementX(double)
	 * @generated
	 */
	boolean isSetDisplacementX();

	/**
	 * Returns the value of the '<em><b>Displacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verschiebung in Y-Richtung. Einheit, wie in "mapLengthFactor" angegeben. Default ist 0.0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Displacement Y</em>' attribute.
	 * @see #isSetDisplacementY()
	 * @see #unsetDisplacementY()
	 * @see #setDisplacementY(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDisplacementType_DisplacementY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='displacementY' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDisplacementY();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementType#getDisplacementY <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement Y</em>' attribute.
	 * @see #isSetDisplacementY()
	 * @see #unsetDisplacementY()
	 * @see #getDisplacementY()
	 * @generated
	 */
	void setDisplacementY(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementType#getDisplacementY <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplacementY()
	 * @see #getDisplacementY()
	 * @see #setDisplacementY(double)
	 * @generated
	 */
	void unsetDisplacementY();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementType#getDisplacementY <em>Displacement Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Displacement Y</em>' attribute is set.
	 * @see #unsetDisplacementY()
	 * @see #getDisplacementY()
	 * @see #setDisplacementY(double)
	 * @generated
	 */
	boolean isSetDisplacementY();

} // DisplacementType
