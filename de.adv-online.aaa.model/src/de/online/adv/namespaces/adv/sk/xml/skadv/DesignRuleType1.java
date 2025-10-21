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
 * A representation of the model object '<em><b>Design Rule Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DesignRuleType1#getPositionierungsregel <em>Positionierungsregel</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DesignRuleType1#getRulesToConsider <em>Rules To Consider</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DesignRuleType1#getPlacement <em>Placement</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDesignRuleType1()
 * @model extendedMetaData="name='DesignRuleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DesignRuleType1 extends ElementType1 {
	/**
	 * Returns the value of the '<em><b>Positionierungsregel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Property "positionierungsregel" dient zur Aufnahme der in den bisherigen Signaturkatalogen verwendeten Positionierungsregeln. Es stellt die Verbindung zu den Präsentationsobjekten her, welche auf die Positionierungsregel Bezug nehmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Positionierungsregel</em>' attribute.
	 * @see #setPositionierungsregel(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDesignRuleType1_Positionierungsregel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='positionierungsregel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPositionierungsregel();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DesignRuleType1#getPositionierungsregel <em>Positionierungsregel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positionierungsregel</em>' attribute.
	 * @see #getPositionierungsregel()
	 * @generated
	 */
	void setPositionierungsregel(String value);

	/**
	 * Returns the value of the '<em><b>Rules To Consider</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.RulesToConsiderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diese Rolle an DesignRule modelliert die im Alt-SK angegebenen "zusätzlich zu beachtenden" Positionierungsregeln, Beim Übergang auf PlacementRules sollen diese Verweise aufgelöst werden und die Sachverhalte ausschließlich mittels der PlacementRules in exakterer Art dargestellt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rules To Consider</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDesignRuleType1_RulesToConsider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rulesToConsider' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RulesToConsiderType> getRulesToConsider();

	/**
	 * Returns the value of the '<em><b>Placement</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.PlacementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geordnete Liste von PlacementRules, die exakt in dieser vorgegebenen Reihenfolge zur Anwendung gebracht werden.
	 *  
	 * Default: ""
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Placement</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDesignRuleType1_Placement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='placement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlacementType> getPlacement();

} // DesignRuleType1
