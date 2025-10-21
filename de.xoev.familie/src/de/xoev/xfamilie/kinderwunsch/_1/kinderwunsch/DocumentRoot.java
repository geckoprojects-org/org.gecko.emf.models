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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch;

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
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getKinderwunschBewilligungsantrag1001 <em>Kinderwunsch Bewilligungsantrag1001</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getKinderwunschNachreichung1003 <em>Kinderwunsch Nachreichung1003</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getKinderwunschVerwendungsnachweispruefung1002 <em>Kinderwunsch Verwendungsnachweispruefung1002</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getDocumentRoot()
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
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getDocumentRoot_Mixed()
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
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Kinderwunsch Bewilligungsantrag1001</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maßnahmen zur Herbeiführung einer Schwangerschaft (künstliche Befruchtung) sind Regel- und Rechtsanspruchsleistungen der gesetzlichen Krankenversicherung und unterliegen einem antrags- und gebührenpflichtigen Erlaubnisverfahren. Die Finanzierung der Maßnahmen zur Herbeiführung einer Schwangerschaft ist nach deren Bewilligung an einer Durchführung durch Ärzte und Einrichtungen, die an der vertragsärztlichen Versorgung teilnehmen, sowie an zugelassene Krankenhäuser gebunden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kinderwunsch Bewilligungsantrag1001</em>' containment reference.
	 * @see #setKinderwunschBewilligungsantrag1001(KinderwunschBewilligungsantrag1001Type)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getDocumentRoot_KinderwunschBewilligungsantrag1001()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kinderwunsch.bewilligungsantrag.1001' namespace='##targetNamespace'"
	 * @generated
	 */
	KinderwunschBewilligungsantrag1001Type getKinderwunschBewilligungsantrag1001();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getKinderwunschBewilligungsantrag1001 <em>Kinderwunsch Bewilligungsantrag1001</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinderwunsch Bewilligungsantrag1001</em>' containment reference.
	 * @see #getKinderwunschBewilligungsantrag1001()
	 * @generated
	 */
	void setKinderwunschBewilligungsantrag1001(KinderwunschBewilligungsantrag1001Type value);

	/**
	 * Returns the value of the '<em><b>Kinderwunsch Nachreichung1003</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit dieser Nachricht können Dokumente nachgereicht werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kinderwunsch Nachreichung1003</em>' containment reference.
	 * @see #setKinderwunschNachreichung1003(KinderwunschNachreichung1003Type)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getDocumentRoot_KinderwunschNachreichung1003()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kinderwunsch.nachreichung.1003' namespace='##targetNamespace'"
	 * @generated
	 */
	KinderwunschNachreichung1003Type getKinderwunschNachreichung1003();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getKinderwunschNachreichung1003 <em>Kinderwunsch Nachreichung1003</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinderwunsch Nachreichung1003</em>' containment reference.
	 * @see #getKinderwunschNachreichung1003()
	 * @generated
	 */
	void setKinderwunschNachreichung1003(KinderwunschNachreichung1003Type value);

	/**
	 * Returns the value of the '<em><b>Kinderwunsch Verwendungsnachweispruefung1002</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Förderung von Kinderwunschbehandlungen Verwendungsnachweisprüfung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kinderwunsch Verwendungsnachweispruefung1002</em>' containment reference.
	 * @see #setKinderwunschVerwendungsnachweispruefung1002(KinderwunschVerwendungsnachweispruefung1002Type)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getDocumentRoot_KinderwunschVerwendungsnachweispruefung1002()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kinderwunsch.verwendungsnachweispruefung.1002' namespace='##targetNamespace'"
	 * @generated
	 */
	KinderwunschVerwendungsnachweispruefung1002Type getKinderwunschVerwendungsnachweispruefung1002();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getKinderwunschVerwendungsnachweispruefung1002 <em>Kinderwunsch Verwendungsnachweispruefung1002</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinderwunsch Verwendungsnachweispruefung1002</em>' containment reference.
	 * @see #getKinderwunschVerwendungsnachweispruefung1002()
	 * @generated
	 */
	void setKinderwunschVerwendungsnachweispruefung1002(KinderwunschVerwendungsnachweispruefung1002Type value);

} // DocumentRoot
