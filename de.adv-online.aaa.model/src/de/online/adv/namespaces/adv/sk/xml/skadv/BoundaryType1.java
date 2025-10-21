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
 * A representation of the model object '<em><b>Boundary Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundaryType1#getSolidOrDashedStrokeGroup <em>Solid Or Dashed Stroke Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundaryType1#getSolidOrDashedStroke <em>Solid Or Dashed Stroke</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getBoundaryType1()
 * @model extendedMetaData="name='boundary_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BoundaryType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Solid Or Dashed Stroke Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SolidOrDashedStroke steht für einfache Liniensignaturen, entweder als durchgezogene Linie (SolidStroke) oder mit einem einfachen Strichliermuster (DashedStroke).
	 * 
	 * Attribute sind die Ausgestaltung an den Linienenden (linecaps), an den Innenpunkten (linejoin) und die Breite der Linie. Verbunden mit "linejoin" ist das Attribut "miterlimit". Ererbt von Stroke wird die Angabe einer Vorlauflücke und einer Nachlauflücke. Am Beginn und Anfang können Graphic-Symbole eingefügt werden.
	 * 
	 * Als Besonderheit kann auch der Rand einer Liniensignator nochmals signaturiert werden. Dies wird durch die Rolle "boundary" spezifiziert.
	 * 
	 * Die Anbindung der Farbe (color) unterliegt der "qualifizierten Assoziation" nach Style. 
	 * 
	 * Die Farbe kann auch entfallen. In diesem Falle sollte wenigstes der Rand der Linie signaturiert werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Or Dashed Stroke Group</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getBoundaryType1_SolidOrDashedStrokeGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='SolidOrDashedStroke:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSolidOrDashedStrokeGroup();

	/**
	 * Returns the value of the '<em><b>Solid Or Dashed Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SolidOrDashedStroke steht für einfache Liniensignaturen, entweder als durchgezogene Linie (SolidStroke) oder mit einem einfachen Strichliermuster (DashedStroke).
	 * 
	 * Attribute sind die Ausgestaltung an den Linienenden (linecaps), an den Innenpunkten (linejoin) und die Breite der Linie. Verbunden mit "linejoin" ist das Attribut "miterlimit". Ererbt von Stroke wird die Angabe einer Vorlauflücke und einer Nachlauflücke. Am Beginn und Anfang können Graphic-Symbole eingefügt werden.
	 * 
	 * Als Besonderheit kann auch der Rand einer Liniensignator nochmals signaturiert werden. Dies wird durch die Rolle "boundary" spezifiziert.
	 * 
	 * Die Anbindung der Farbe (color) unterliegt der "qualifizierten Assoziation" nach Style. 
	 * 
	 * Die Farbe kann auch entfallen. In diesem Falle sollte wenigstes der Rand der Linie signaturiert werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Or Dashed Stroke</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getBoundaryType1_SolidOrDashedStroke()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SolidOrDashedStroke' namespace='##targetNamespace' group='SolidOrDashedStroke:group'"
	 * @generated
	 */
	SolidOrDashedStrokeType getSolidOrDashedStroke();

} // BoundaryType1
