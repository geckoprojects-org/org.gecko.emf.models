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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragAntrag0301 <em>Unterhaltsvorschussantrag Antrag0301</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302 <em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragNachreichen0303 <em>Unterhaltsvorschussantrag Nachreichen0303</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragNachweisnachricht0311 <em>Unterhaltsvorschussantrag Nachweisnachricht0311</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Unterhaltsvorschussantrag Antrag0301</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachricht vom Portal an die Unterhaltsvorschussstelle für einen Antrag eines Elternteils auf Unterhaltsvorschuss für ein Kind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterhaltsvorschussantrag Antrag0301</em>' containment reference.
	 * @see #setUnterhaltsvorschussantragAntrag0301(UnterhaltsvorschussantragAntrag0301Type)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getDocumentRoot_UnterhaltsvorschussantragAntrag0301()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unterhaltsvorschussantrag.antrag.0301' namespace='##targetNamespace'"
	 * @generated
	 */
	UnterhaltsvorschussantragAntrag0301Type getUnterhaltsvorschussantragAntrag0301();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragAntrag0301 <em>Unterhaltsvorschussantrag Antrag0301</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterhaltsvorschussantrag Antrag0301</em>' containment reference.
	 * @see #getUnterhaltsvorschussantragAntrag0301()
	 * @generated
	 */
	void setUnterhaltsvorschussantragAntrag0301(UnterhaltsvorschussantragAntrag0301Type value);

	/**
	 * Returns the value of the '<em><b>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachricht vom Portal an die Unterhaltsvorschussstelle für die jährliche Überprüfung des Antrags eines Elternteils auf Unterhaltsvorschuss für ein Kind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302</em>' containment reference.
	 * @see #setUnterhaltsvorschussantragJaehrlicheUeberpruefung0302(UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getDocumentRoot_UnterhaltsvorschussantragJaehrlicheUeberpruefung0302()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unterhaltsvorschussantrag.JaehrlicheUeberpruefung.0302' namespace='##targetNamespace'"
	 * @generated
	 */
	UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302 <em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302</em>' containment reference.
	 * @see #getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302()
	 * @generated
	 */
	void setUnterhaltsvorschussantragJaehrlicheUeberpruefung0302(UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type value);

	/**
	 * Returns the value of the '<em><b>Unterhaltsvorschussantrag Nachreichen0303</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachricht zum Nachreichen von Informationen für einen Unterhaltsvorschussantrag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterhaltsvorschussantrag Nachreichen0303</em>' containment reference.
	 * @see #setUnterhaltsvorschussantragNachreichen0303(UnterhaltsvorschussantragNachreichen0303Type)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getDocumentRoot_UnterhaltsvorschussantragNachreichen0303()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unterhaltsvorschussantrag.nachreichen.0303' namespace='##targetNamespace'"
	 * @generated
	 */
	UnterhaltsvorschussantragNachreichen0303Type getUnterhaltsvorschussantragNachreichen0303();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragNachreichen0303 <em>Unterhaltsvorschussantrag Nachreichen0303</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterhaltsvorschussantrag Nachreichen0303</em>' containment reference.
	 * @see #getUnterhaltsvorschussantragNachreichen0303()
	 * @generated
	 */
	void setUnterhaltsvorschussantragNachreichen0303(UnterhaltsvorschussantragNachreichen0303Type value);

	/**
	 * Returns the value of the '<em><b>Unterhaltsvorschussantrag Nachweisnachricht0311</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit dieser Nachricht koennen Nachweise vom Portal an die zustaendige Stelle transportiert werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterhaltsvorschussantrag Nachweisnachricht0311</em>' containment reference.
	 * @see #setUnterhaltsvorschussantragNachweisnachricht0311(UnterhaltsvorschussantragNachweisnachricht0311Type)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getDocumentRoot_UnterhaltsvorschussantragNachweisnachricht0311()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='unterhaltsvorschussantrag.nachweisnachricht.0311' namespace='##targetNamespace'"
	 * @generated
	 */
	UnterhaltsvorschussantragNachweisnachricht0311Type getUnterhaltsvorschussantragNachweisnachricht0311();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot#getUnterhaltsvorschussantragNachweisnachricht0311 <em>Unterhaltsvorschussantrag Nachweisnachricht0311</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterhaltsvorschussantrag Nachweisnachricht0311</em>' containment reference.
	 * @see #getUnterhaltsvorschussantragNachweisnachricht0311()
	 * @generated
	 */
	void setUnterhaltsvorschussantragNachweisnachricht0311(UnterhaltsvorschussantragNachweisnachricht0311Type value);

} // DocumentRoot
