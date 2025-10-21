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
 * A representation of the model object '<em><b>Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleType#getFilter <em>Filter</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleType#getEmit <em>Emit</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRuleType()
 * @model extendedMetaData="name='RuleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RuleType extends ElementType1 {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der zu einer Rule gehörende Filter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRuleType_Filter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleType#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Emit</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein zu einer Rule gehörendes Emit.
	 * 
	 * Die Reihenfolge der Emits ist unerheblich, da die Sichtbarkeit in der Karte durch den im Emit enthaltenen zIndex gesteuert wird.
	 * 
	 * Die Zuordnung der Emit-Objekte unterliegt der Auswahl durch Style.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emit</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRuleType_Emit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='emit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EmitType> getEmit();

} // RuleType
