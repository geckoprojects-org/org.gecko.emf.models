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
 * A representation of the model object '<em><b>Relate Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateGeometryType#getRelate <em>Relate</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateGeometryType#getRelateFilter <em>Relate Filter</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRelateGeometryType()
 * @model extendedMetaData="name='RelateGeometryType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RelateGeometryType extends PlacementRuleType {
	/**
	 * Returns the value of the '<em><b>Relate</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gewünschte Art der Geometriebehandlung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relate</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RelateType
	 * @see #isSetRelate()
	 * @see #unsetRelate()
	 * @see #setRelate(RelateType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRelateGeometryType_Relate()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='relate' namespace='##targetNamespace'"
	 * @generated
	 */
	RelateType getRelate();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateGeometryType#getRelate <em>Relate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relate</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RelateType
	 * @see #isSetRelate()
	 * @see #unsetRelate()
	 * @see #getRelate()
	 * @generated
	 */
	void setRelate(RelateType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateGeometryType#getRelate <em>Relate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelate()
	 * @see #getRelate()
	 * @see #setRelate(RelateType)
	 * @generated
	 */
	void unsetRelate();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateGeometryType#getRelate <em>Relate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relate</em>' attribute is set.
	 * @see #unsetRelate()
	 * @see #getRelate()
	 * @see #setRelate(RelateType)
	 * @generated
	 */
	boolean isSetRelate();

	/**
	 * Returns the value of the '<em><b>Relate Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über "realateFilter" wird ein Prädikat angegeben, das zur Selektion von Geometrien dient, die mit der laufenden Geometrie verschnitten werden sollen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relate Filter</em>' containment reference.
	 * @see #setRelateFilter(RelateFilterType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRelateGeometryType_RelateFilter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relateFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	RelateFilterType getRelateFilter();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateGeometryType#getRelateFilter <em>Relate Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relate Filter</em>' containment reference.
	 * @see #getRelateFilter()
	 * @generated
	 */
	void setRelateFilter(RelateFilterType value);

} // RelateGeometryType
