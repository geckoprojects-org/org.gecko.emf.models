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
 * A representation of the model object '<em><b>Boundary Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundaryType2#getStrokeGroup <em>Stroke Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundaryType2#getStroke <em>Stroke</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getBoundaryType2()
 * @model extendedMetaData="name='boundary_._2_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BoundaryType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Stroke Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte Klasse Stroke enthält die Definition für die Signaturierung einer Liniengeometrie.
	 * 
	 * Allen Stroke-Definitionen gemeinsam ist die mögliche Angabe von Lücken am Anfang und Ende der Linie. Zusätzlich kann bei allen Strokes noch ein Graphic am Anfang und am Ende der Linie platziert werden.
	 * 
	 * Die Ausgabe der Graphics am Anfang und Ende erfolgt nach der Ausgabe aller anderen Teile der Linie.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stroke Group</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getBoundaryType2_StrokeGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='Stroke:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getStrokeGroup();

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte Klasse Stroke enthält die Definition für die Signaturierung einer Liniengeometrie.
	 * 
	 * Allen Stroke-Definitionen gemeinsam ist die mögliche Angabe von Lücken am Anfang und Ende der Linie. Zusätzlich kann bei allen Strokes noch ein Graphic am Anfang und am Ende der Linie platziert werden.
	 * 
	 * Die Ausgabe der Graphics am Anfang und Ende erfolgt nach der Ausgabe aller anderen Teile der Linie.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stroke</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getBoundaryType2_Stroke()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Stroke' namespace='##targetNamespace' group='Stroke:group'"
	 * @generated
	 */
	StrokeType5 getStroke();

} // BoundaryType2
