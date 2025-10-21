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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Halo Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.HaloType1#getRadius <em>Radius</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.HaloType1#getHaloColor <em>Halo Color</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.HaloType1#getTargetColor <em>Target Color</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getHaloType1()
 * @model extendedMetaData="name='HaloType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface HaloType1 extends ElementType1 {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "radius" gibt die Breite des freizustellenden Saums um die Textkörper vor. Der Standardwert ist 50. 
	 * 
	 * Die Einheit von "radius" ist die durch "mapLengthFactor" vorgegebene (Default: mm/100).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #setRadius(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getHaloType1_Radius()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='radius' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HaloType1#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #isSetRadius()
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HaloType1#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadius()
	 * @see #getRadius()
	 * @see #setRadius(double)
	 * @generated
	 */
	void unsetRadius();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HaloType1#getRadius <em>Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radius</em>' attribute is set.
	 * @see #unsetRadius()
	 * @see #getRadius()
	 * @see #setRadius(double)
	 * @generated
	 */
	boolean isSetRadius();

	/**
	 * Returns the value of the '<em><b>Halo Color</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.HaloColorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Farbe des Halo.
	 * 
	 * Wir keine Farbe angegeben, so wird der Halo durchsichtig angelegt.
	 * 
	 * Die Auswahl der Farbe unterliegt dem Style, Es darf nur höchstens ein Color-Objekt geben das nach Auswahl über Style mit dem Halo-Objekt verbunden ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Halo Color</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getHaloType1_HaloColor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='haloColor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<HaloColorType> getHaloColor();

	/**
	 * Returns the value of the '<em><b>Target Color</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.TargetColorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die targetColor-Angaben spezifizieren die Farben, gegen die die Halobildung wirken soll. Wird keine Farbe angegeben, so wirkt die Halobildung gegen alle Farben.
	 * 
	 * Die Auswahl der targetColor unterliegt dem Style,
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Color</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getHaloType1_TargetColor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetColor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TargetColorType> getTargetColor();

} // HaloType1
