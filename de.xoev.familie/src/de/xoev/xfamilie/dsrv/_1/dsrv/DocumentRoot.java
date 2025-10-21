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
package de.xoev.xfamilie.dsrv._1.dsrv;

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
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getDsrvAnfragervbea0401 <em>Dsrv Anfragervbea0401</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getDsrvEinkommensdatenrvbea0402 <em>Dsrv Einkommensdatenrvbea0402</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getDsrvStatusantwortrvbea0403 <em>Dsrv Statusantwortrvbea0403</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDocumentRoot()
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
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDocumentRoot_Mixed()
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
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Dsrv Anfragervbea0401</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das ELFE-Backend schickt zur Ermittlung der Einkommensdaten eine initiale Anfragenachricht per OSCI an die DSRV.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsrv Anfragervbea0401</em>' containment reference.
	 * @see #setDsrvAnfragervbea0401(DsrvAnfragervbea0401Type)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDocumentRoot_DsrvAnfragervbea0401()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dsrv.anfragervbea.0401' namespace='##targetNamespace'"
	 * @generated
	 */
	DsrvAnfragervbea0401Type getDsrvAnfragervbea0401();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getDsrvAnfragervbea0401 <em>Dsrv Anfragervbea0401</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsrv Anfragervbea0401</em>' containment reference.
	 * @see #getDsrvAnfragervbea0401()
	 * @generated
	 */
	void setDsrvAnfragervbea0401(DsrvAnfragervbea0401Type value);

	/**
	 * Returns the value of the '<em><b>Dsrv Einkommensdatenrvbea0402</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für jeden gefundenen Arbeitgeber wird eine Abfrage über rvBEA gestartet, um die Einkommensdaten für den angefragten Zeitraum zu ermitteln. Die Antworten der Arbeitgeber erfolgen im Format DXEB welches, versehen mit einer Präambel, sofort an ELFE zurückgemeldet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsrv Einkommensdatenrvbea0402</em>' containment reference.
	 * @see #setDsrvEinkommensdatenrvbea0402(DsrvEinkommensdatenrvbea0402Type)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDocumentRoot_DsrvEinkommensdatenrvbea0402()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dsrv.einkommensdatenrvbea.0402' namespace='##targetNamespace'"
	 * @generated
	 */
	DsrvEinkommensdatenrvbea0402Type getDsrvEinkommensdatenrvbea0402();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getDsrvEinkommensdatenrvbea0402 <em>Dsrv Einkommensdatenrvbea0402</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsrv Einkommensdatenrvbea0402</em>' containment reference.
	 * @see #getDsrvEinkommensdatenrvbea0402()
	 * @generated
	 */
	void setDsrvEinkommensdatenrvbea0402(DsrvEinkommensdatenrvbea0402Type value);

	/**
	 * Returns the value of the '<em><b>Dsrv Statusantwortrvbea0403</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausgehend von der initialen Anfrage wird versucht in den Datenbanken der DSRV eine Versicherungsnummer zu ermitteln. Falls dies nicht eindeutig gelingt, wird eine Fehlermeldung zurückgeschickt. Beide Varianten haben einen gemeinsamen Datenkopf.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dsrv Statusantwortrvbea0403</em>' containment reference.
	 * @see #setDsrvStatusantwortrvbea0403(DsrvStatusantwortrvbea0403Type)
	 * @see de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage#getDocumentRoot_DsrvStatusantwortrvbea0403()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dsrv.statusantwortrvbea.0403' namespace='##targetNamespace'"
	 * @generated
	 */
	DsrvStatusantwortrvbea0403Type getDsrvStatusantwortrvbea0403();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot#getDsrvStatusantwortrvbea0403 <em>Dsrv Statusantwortrvbea0403</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dsrv Statusantwortrvbea0403</em>' containment reference.
	 * @see #getDsrvStatusantwortrvbea0403()
	 * @generated
	 */
	void setDsrvStatusantwortrvbea0403(DsrvStatusantwortrvbea0403Type value);

} // DocumentRoot
