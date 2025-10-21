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
 * A representation of the model object '<em><b>Compound Stroke Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeType#getAdjustment <em>Adjustment</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeType#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCompoundStrokeType()
 * @model extendedMetaData="name='CompoundStrokeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CompoundStrokeType extends StrokeType5 {
	/**
	 * Returns the value of the '<em><b>Adjustment</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.AdjustmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch "adjustment" kann der Ausgleich des Musters in der Gesamtgeometrie (ohne die Lücken am Anfang und Ende) gefordert werden.
	 * 
	 * Standardwert ist "none", also kein Ausgleich. Bei "wholePattern" werden Lücken und Linien verlängert bzw. verkürzt.
	 * 
	 * Eine Skizze des Verfahrens für den Musterausgleich bei "wholePattern" befindet sich in dessen Definition beim Typ Adjustment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjustment</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AdjustmentType
	 * @see #isSetAdjustment()
	 * @see #unsetAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCompoundStrokeType_Adjustment()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='adjustment' namespace='##targetNamespace'"
	 * @generated
	 */
	AdjustmentType getAdjustment();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeType#getAdjustment <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjustment</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AdjustmentType
	 * @see #isSetAdjustment()
	 * @see #unsetAdjustment()
	 * @see #getAdjustment()
	 * @generated
	 */
	void setAdjustment(AdjustmentType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeType#getAdjustment <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdjustment()
	 * @see #getAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @generated
	 */
	void unsetAdjustment();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeType#getAdjustment <em>Adjustment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Adjustment</em>' attribute is set.
	 * @see #unsetAdjustment()
	 * @see #getAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @generated
	 */
	boolean isSetAdjustment();

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.SectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine CompoundStrokeSection zu einem CompoundStroke.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getCompoundStrokeType_Section()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SectionType> getSection();

} // CompoundStrokeType
