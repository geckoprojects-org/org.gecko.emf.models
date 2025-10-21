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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType1#getLineLabel <em>Line Label</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType1()
 * @model extendedMetaData="name='label_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LabelType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Line Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LineLabel verortet Text an einer Linie oder an der Randlinie einer Fläche. 
	 * 
	 * Zusätzlich zu den von Label ererbten Attributen ermöglicht LineLabel eine Verschiebung des Texts senkrecht zur Linie. 
	 * 
	 * Die Wirkung von "horizonatalAlignment" bezieht sich auf die Linie. "verticalAlignment" steuert die Verschiebung senkrecht zur Linie.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Label</em>' containment reference.
	 * @see #setLineLabel(LineLabelType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType1_LineLabel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LineLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	LineLabelType getLineLabel();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType1#getLineLabel <em>Line Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Label</em>' containment reference.
	 * @see #getLineLabel()
	 * @generated
	 */
	void setLineLabel(LineLabelType value);

} // LabelType1
