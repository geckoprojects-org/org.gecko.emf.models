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
 * A representation of the model object '<em><b>Variant Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariantGeometryType#getMode <em>Mode</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariantGeometryType#getGeometry <em>Geometry</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getVariantGeometryType()
 * @model extendedMetaData="name='VariantGeometryType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VariantGeometryType extends PlacementRuleType {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.GeometryUnionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wenn die angegebene Expression bei VariantGeometry eine Menge von Geometrien selektiert, so kann durch das Attribut "mode" eingestellt werden, wie die Aggregation der Einzelgeometrien erfolgen soll. 
	 * 
	 * Der Defaultwert "standardOrUnion" steht für die Übernahme der Geometrie, wenn die Menge nur ein Element enthält, und für die Vereinigung der Geometrien sonst. 
	 * 
	 * Der Sonderwert "AP_Darstellung" bei "mode" ist eine Abkürzung für die Expression "dientZurDarstellungVonPosition". In diesem Fall entfällt die Expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GeometryUnionType
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(GeometryUnionType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getVariantGeometryType_Mode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='mode' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryUnionType getMode();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariantGeometryType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GeometryUnionType
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(GeometryUnionType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariantGeometryType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(GeometryUnionType)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariantGeometryType#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(GeometryUnionType)
	 * @generated
	 */
	boolean isSetMode();

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "geometry" ist ein geometrie-wertiger Ausdruck. Er setzt das Ergebnis der PlacementRule VariantGeometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(GeometryType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getVariantGeometryType_Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryType getGeometry();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariantGeometryType#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(GeometryType value);

} // VariantGeometryType
