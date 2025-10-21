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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType2#getLabelGroup <em>Label Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType2#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType2()
 * @model extendedMetaData="name='label_._2_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LabelType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Label steuert das Aussehen von Text und legt fest, wie dieser durch die Geometrie zu verorten ist. Der Textinhalt wird normalerweise durch das zugehörige Emit-Objekt vorgegeben. Diese Vorgabe im Emit kann aber durch eine Angabe im Label-Objekt überschrieben werden.
	 * 
	 * Um Kompatibilität mit dem bisherigen SK zu ermöglichen, ist Label als konkrete Klasse angelegt. Dies war im Design eigentlich nicht beabsichtigt gewesen. Der Grund ist der, dass im bisherigen SK die zu treffende Unterscheidung zwischen linienbezogener und punktbezogener Ausgestaltung nur in den textlich verfassten Positionierungsregeln beschrieben wird. 
	 * 
	 * Wenn diese später in eine exakte Form überführt werden, wird empfohlen, die Verwendung von Label zugunsten der beiden konkreten Ausprägungen, LineLabel und PointLabel, aufzugeben.
	 * 
	 * Die Steuerung der Textausgabe ermöglicht die Angabe des Texts selbst als Expression. Weiter können angegeben werden seine Größe, die Sperrung des Texts, mehrere Arten der Unterstreichung, seine Skalierung und seine Ausrichtung. Die Farbe wird über SolidFill ausgewählt. Die typischen Font-Parameter sind in einem angeschlossenen Font-Objekt zusammengefasst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Group</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType2_LabelGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='Label:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLabelGroup();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Label steuert das Aussehen von Text und legt fest, wie dieser durch die Geometrie zu verorten ist. Der Textinhalt wird normalerweise durch das zugehörige Emit-Objekt vorgegeben. Diese Vorgabe im Emit kann aber durch eine Angabe im Label-Objekt überschrieben werden.
	 * 
	 * Um Kompatibilität mit dem bisherigen SK zu ermöglichen, ist Label als konkrete Klasse angelegt. Dies war im Design eigentlich nicht beabsichtigt gewesen. Der Grund ist der, dass im bisherigen SK die zu treffende Unterscheidung zwischen linienbezogener und punktbezogener Ausgestaltung nur in den textlich verfassten Positionierungsregeln beschrieben wird. 
	 * 
	 * Wenn diese später in eine exakte Form überführt werden, wird empfohlen, die Verwendung von Label zugunsten der beiden konkreten Ausprägungen, LineLabel und PointLabel, aufzugeben.
	 * 
	 * Die Steuerung der Textausgabe ermöglicht die Angabe des Texts selbst als Expression. Weiter können angegeben werden seine Größe, die Sperrung des Texts, mehrere Arten der Unterstreichung, seine Skalierung und seine Ausrichtung. Die Farbe wird über SolidFill ausgewählt. Die typischen Font-Parameter sind in einem angeschlossenen Font-Objekt zusammengefasst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelType3)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType2_Label()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Label' namespace='##targetNamespace' group='Label:group'"
	 * @generated
	 */
	LabelType3 getLabel();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType2#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType3 value);

} // LabelType2
