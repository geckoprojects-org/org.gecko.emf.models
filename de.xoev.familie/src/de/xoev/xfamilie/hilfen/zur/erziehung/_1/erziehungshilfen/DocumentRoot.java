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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen;

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
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungAnfrageHJV0702 <em>Hilfen Zur Erziehung Anfrage HJV0702</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungAntrag0701 <em>Hilfen Zur Erziehung Antrag0701</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungEingliederungshilfe0703 <em>Hilfen Zur Erziehung Eingliederungshilfe0703</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungNachweisnachricht0711 <em>Hilfen Zur Erziehung Nachweisnachricht0711</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungWiderspruch0704 <em>Hilfen Zur Erziehung Widerspruch0704</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getDocumentRoot()
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
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getDocumentRoot_Mixed()
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
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Hilfen Zur Erziehung Anfrage HJV0702</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit dieser Nachricht werden die Daten zur Eingliederungshilfe strukturiert von einem Portal an die zuständigen Jugendämter versendet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hilfen Zur Erziehung Anfrage HJV0702</em>' containment reference.
	 * @see #setHilfenZurErziehungAnfrageHJV0702(HilfenZurErziehungAnfrageHJV0702Type)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getDocumentRoot_HilfenZurErziehungAnfrageHJV0702()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hilfenZurErziehung.anfrageHJV.0702' namespace='##targetNamespace'"
	 * @generated
	 */
	HilfenZurErziehungAnfrageHJV0702Type getHilfenZurErziehungAnfrageHJV0702();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungAnfrageHJV0702 <em>Hilfen Zur Erziehung Anfrage HJV0702</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hilfen Zur Erziehung Anfrage HJV0702</em>' containment reference.
	 * @see #getHilfenZurErziehungAnfrageHJV0702()
	 * @generated
	 */
	void setHilfenZurErziehungAnfrageHJV0702(HilfenZurErziehungAnfrageHJV0702Type value);

	/**
	 * Returns the value of the '<em><b>Hilfen Zur Erziehung Antrag0701</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit dieser Nachricht werden die Daten zur Hilfe zur Erziehung strukturiert von einem Portal an die zuständigen Jugendämter versendet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hilfen Zur Erziehung Antrag0701</em>' containment reference.
	 * @see #setHilfenZurErziehungAntrag0701(HilfenZurErziehungAntrag0701Type)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getDocumentRoot_HilfenZurErziehungAntrag0701()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hilfenZurErziehung.antrag.0701' namespace='##targetNamespace'"
	 * @generated
	 */
	HilfenZurErziehungAntrag0701Type getHilfenZurErziehungAntrag0701();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungAntrag0701 <em>Hilfen Zur Erziehung Antrag0701</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hilfen Zur Erziehung Antrag0701</em>' containment reference.
	 * @see #getHilfenZurErziehungAntrag0701()
	 * @generated
	 */
	void setHilfenZurErziehungAntrag0701(HilfenZurErziehungAntrag0701Type value);

	/**
	 * Returns the value of the '<em><b>Hilfen Zur Erziehung Eingliederungshilfe0703</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit dieser Nachricht werden die Daten zur Eingliederungshilfe strukturiert von einem Portal an die zuständigen Jugendämter versendet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hilfen Zur Erziehung Eingliederungshilfe0703</em>' containment reference.
	 * @see #setHilfenZurErziehungEingliederungshilfe0703(HilfenZurErziehungEingliederungshilfe0703Type)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getDocumentRoot_HilfenZurErziehungEingliederungshilfe0703()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hilfenZurErziehung.eingliederungshilfe.0703' namespace='##targetNamespace'"
	 * @generated
	 */
	HilfenZurErziehungEingliederungshilfe0703Type getHilfenZurErziehungEingliederungshilfe0703();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungEingliederungshilfe0703 <em>Hilfen Zur Erziehung Eingliederungshilfe0703</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hilfen Zur Erziehung Eingliederungshilfe0703</em>' containment reference.
	 * @see #getHilfenZurErziehungEingliederungshilfe0703()
	 * @generated
	 */
	void setHilfenZurErziehungEingliederungshilfe0703(HilfenZurErziehungEingliederungshilfe0703Type value);

	/**
	 * Returns the value of the '<em><b>Hilfen Zur Erziehung Nachweisnachricht0711</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit dieser Nachricht können Nachweise vom Portal an die zuständige Stelle transportiert werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hilfen Zur Erziehung Nachweisnachricht0711</em>' containment reference.
	 * @see #setHilfenZurErziehungNachweisnachricht0711(HilfenZurErziehungNachweisnachricht0711Type)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getDocumentRoot_HilfenZurErziehungNachweisnachricht0711()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hilfenZurErziehung.nachweisnachricht.0711' namespace='##targetNamespace'"
	 * @generated
	 */
	HilfenZurErziehungNachweisnachricht0711Type getHilfenZurErziehungNachweisnachricht0711();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungNachweisnachricht0711 <em>Hilfen Zur Erziehung Nachweisnachricht0711</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hilfen Zur Erziehung Nachweisnachricht0711</em>' containment reference.
	 * @see #getHilfenZurErziehungNachweisnachricht0711()
	 * @generated
	 */
	void setHilfenZurErziehungNachweisnachricht0711(HilfenZurErziehungNachweisnachricht0711Type value);

	/**
	 * Returns the value of the '<em><b>Hilfen Zur Erziehung Widerspruch0704</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit dieser Nachricht kann ein Widerspruch an die zuständige Stelle übermittelt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hilfen Zur Erziehung Widerspruch0704</em>' containment reference.
	 * @see #setHilfenZurErziehungWiderspruch0704(HilfenZurErziehungWiderspruch0704Type)
	 * @see de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage#getDocumentRoot_HilfenZurErziehungWiderspruch0704()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hilfenZurErziehung.widerspruch.0704' namespace='##targetNamespace'"
	 * @generated
	 */
	HilfenZurErziehungWiderspruch0704Type getHilfenZurErziehungWiderspruch0704();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot#getHilfenZurErziehungWiderspruch0704 <em>Hilfen Zur Erziehung Widerspruch0704</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hilfen Zur Erziehung Widerspruch0704</em>' containment reference.
	 * @see #getHilfenZurErziehungWiderspruch0704()
	 * @generated
	 */
	void setHilfenZurErziehungWiderspruch0704(HilfenZurErziehungWiderspruch0704Type value);

} // DocumentRoot
