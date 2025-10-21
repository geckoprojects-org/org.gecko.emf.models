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
package de.xoev.schemata.basisnachricht.g2g.basisg2g;

import de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BehoerdeType;

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
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.DocumentRoot#getAutor <em>Autor</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.DocumentRoot#getIdentifikationNachricht <em>Identifikation Nachricht</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.DocumentRoot#getLeser <em>Leser</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.DocumentRoot#getNachrichtenkopfG2g <em>Nachrichtenkopf G2g</em>}</li>
 * </ul>
 *
 * @see de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage#getDocumentRoot()
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
	 * @see de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage#getDocumentRoot_Mixed()
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
	 * @see de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Autor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält Angaben zum Autor der Nachricht, die es dem Leser ermöglichen, bei Bedarf mit dem Autor in Verbindung zu treten. Der Autor ist die fachlich zuständige Behörde / öffentliche Stelle, die die Nachricht erstellt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Autor</em>' containment reference.
	 * @see #setAutor(BehoerdeType)
	 * @see de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage#getDocumentRoot_Autor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='autor' namespace='##targetNamespace'"
	 * @generated
	 */
	BehoerdeType getAutor();

	/**
	 * Sets the value of the '{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.DocumentRoot#getAutor <em>Autor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autor</em>' containment reference.
	 * @see #getAutor()
	 * @generated
	 */
	void setAutor(BehoerdeType value);

	/**
	 * Returns the value of the '<em><b>Identifikation Nachricht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält Angaben zur eindeutigen Identifikation einer Nachricht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifikation Nachricht</em>' containment reference.
	 * @see #setIdentifikationNachricht(IdentifikationNachrichtType)
	 * @see de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage#getDocumentRoot_IdentifikationNachricht()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='identifikation.nachricht' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifikationNachrichtType getIdentifikationNachricht();

	/**
	 * Sets the value of the '{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.DocumentRoot#getIdentifikationNachricht <em>Identifikation Nachricht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifikation Nachricht</em>' containment reference.
	 * @see #getIdentifikationNachricht()
	 * @generated
	 */
	void setIdentifikationNachricht(IdentifikationNachrichtType value);

	/**
	 * Returns the value of the '<em><b>Leser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält Angaben zum Leser der Nachricht. Der Leser ist die fachlich zuständige Behörde / öffentliche Stelle, der die Nachricht zugestellt werden soll und die die Nachricht fachlich verarbeiten soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leser</em>' containment reference.
	 * @see #setLeser(BehoerdeType)
	 * @see de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage#getDocumentRoot_Leser()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='leser' namespace='##targetNamespace'"
	 * @generated
	 */
	BehoerdeType getLeser();

	/**
	 * Sets the value of the '{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.DocumentRoot#getLeser <em>Leser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leser</em>' containment reference.
	 * @see #getLeser()
	 * @generated
	 */
	void setLeser(BehoerdeType value);

	/**
	 * Returns the value of the '<em><b>Nachrichtenkopf G2g</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachrichtenkopf für Nachrichten zwischen Behörden und anderen (öffentlichen) Stellen. Der Nachrichtenkopf umfasst Angaben zur eindeutigen Identifikation des Autors und des Lesers der Nachricht sowie der Nachricht selbst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachrichtenkopf G2g</em>' containment reference.
	 * @see #setNachrichtenkopfG2g(NachrichtenkopfG2GType)
	 * @see de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage#getDocumentRoot_NachrichtenkopfG2g()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nachrichtenkopf.g2g' namespace='##targetNamespace'"
	 * @generated
	 */
	NachrichtenkopfG2GType getNachrichtenkopfG2g();

	/**
	 * Sets the value of the '{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.DocumentRoot#getNachrichtenkopfG2g <em>Nachrichtenkopf G2g</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachrichtenkopf G2g</em>' containment reference.
	 * @see #getNachrichtenkopfG2g()
	 * @generated
	 */
	void setNachrichtenkopfG2g(NachrichtenkopfG2GType value);

} // DocumentRoot
