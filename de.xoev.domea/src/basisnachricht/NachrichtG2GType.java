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
package basisnachricht;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachricht G2G Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basistyp für alle Nachrichten zwischen Behörden und anderen öffentlichen Stellen (government-to-government).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link basisnachricht.NachrichtG2GType#getNachrichtenkopfG2g <em>Nachrichtenkopf G2g</em>}</li>
 *   <li>{@link basisnachricht.NachrichtG2GType#getProdukt <em>Produkt</em>}</li>
 *   <li>{@link basisnachricht.NachrichtG2GType#getProdukthersteller <em>Produkthersteller</em>}</li>
 *   <li>{@link basisnachricht.NachrichtG2GType#getProduktversion <em>Produktversion</em>}</li>
 *   <li>{@link basisnachricht.NachrichtG2GType#getStandard <em>Standard</em>}</li>
 *   <li>{@link basisnachricht.NachrichtG2GType#getTest <em>Test</em>}</li>
 *   <li>{@link basisnachricht.NachrichtG2GType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see basisnachricht.BasisnachrichtPackage#getNachrichtG2GType()
 * @model extendedMetaData="name='Nachricht.G2GType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachrichtG2GType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nachrichtenkopf G2g</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachrichtenkopf für Nachrichten zwischen Behörden und anderen (öffentlichen) Stellen. Der Nachrichtenkopf umfasst Angaben zur eindeutigen Identifikation des Autors und des Lesers der Nachricht sowie der Nachricht selbst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachrichtenkopf G2g</em>' containment reference.
	 * @see #setNachrichtenkopfG2g(NachrichtenkopfG2GType)
	 * @see basisnachricht.BasisnachrichtPackage#getNachrichtG2GType_NachrichtenkopfG2g()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nachrichtenkopf.g2g'"
	 * @generated
	 */
	NachrichtenkopfG2GType getNachrichtenkopfG2g();

	/**
	 * Sets the value of the '{@link basisnachricht.NachrichtG2GType#getNachrichtenkopfG2g <em>Nachrichtenkopf G2g</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachrichtenkopf G2g</em>' containment reference.
	 * @see #getNachrichtenkopfG2g()
	 * @generated
	 */
	void setNachrichtenkopfG2g(NachrichtenkopfG2GType value);

	/**
	 * Returns the value of the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Attribut ist der Name des Produktes (der Software) einzutragen, mit dem die Nachricht erstellt worden ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produkt</em>' attribute.
	 * @see #setProdukt(String)
	 * @see basisnachricht.BasisnachrichtPackage#getNachrichtG2GType_Produkt()
	 * @model dataType="datatypedin.DatatypeC" required="true"
	 *        extendedMetaData="kind='attribute' name='produkt'"
	 * @generated
	 */
	String getProdukt();

	/**
	 * Sets the value of the '{@link basisnachricht.NachrichtG2GType#getProdukt <em>Produkt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produkt</em>' attribute.
	 * @see #getProdukt()
	 * @generated
	 */
	void setProdukt(String value);

	/**
	 * Returns the value of the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Attribut wird der Name der Organisation / Firma übermittelt, die für das Produkt (die Software) verantwortlich ist, mit dem die Nachricht erstellt wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produkthersteller</em>' attribute.
	 * @see #setProdukthersteller(String)
	 * @see basisnachricht.BasisnachrichtPackage#getNachrichtG2GType_Produkthersteller()
	 * @model dataType="datatypedin.DatatypeC" required="true"
	 *        extendedMetaData="kind='attribute' name='produkthersteller'"
	 * @generated
	 */
	String getProdukthersteller();

	/**
	 * Sets the value of the '{@link basisnachricht.NachrichtG2GType#getProdukthersteller <em>Produkthersteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produkthersteller</em>' attribute.
	 * @see #getProdukthersteller()
	 * @generated
	 */
	void setProdukthersteller(String value);

	/**
	 * Returns the value of the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Attribut werden ergänzende Hinweise zu dem Produkt eingetragen. Dies sind Angaben, die für eine möglichst präzise Identifikation im Fehlerfall hilfreich sind, wie zum Beispiel Version und Patchlevel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produktversion</em>' attribute.
	 * @see #setProduktversion(String)
	 * @see basisnachricht.BasisnachrichtPackage#getNachrichtG2GType_Produktversion()
	 * @model dataType="datatypedin.DatatypeC"
	 *        extendedMetaData="kind='attribute' name='produktversion'"
	 * @generated
	 */
	String getProduktversion();

	/**
	 * Sets the value of the '{@link basisnachricht.NachrichtG2GType#getProduktversion <em>Produktversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produktversion</em>' attribute.
	 * @see #getProduktversion()
	 * @generated
	 */
	void setProduktversion(String value);

	/**
	 * Returns the value of the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Attribut wird der Name des XÖV-Standards angegeben, aus dem die Nachricht stammt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard</em>' attribute.
	 * @see #setStandard(String)
	 * @see basisnachricht.BasisnachrichtPackage#getNachrichtG2GType_Standard()
	 * @model dataType="datatypedin.DatatypeC" required="true"
	 *        extendedMetaData="kind='attribute' name='standard'"
	 * @generated
	 */
	String getStandard();

	/**
	 * Sets the value of the '{@link basisnachricht.NachrichtG2GType#getStandard <em>Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard</em>' attribute.
	 * @see #getStandard()
	 * @generated
	 */
	void setStandard(String value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ist dieses Attribut vorhanden, handelt es sich aus Sicht des Autors um eine Testnachricht, die nicht im normalen Produktivbetrieb verarbeitet werden darf. Autor und Leser können bilateral weitere Absprachen über den konkreten Inhalt des Attributs treffen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test</em>' attribute.
	 * @see #setTest(String)
	 * @see basisnachricht.BasisnachrichtPackage#getNachrichtG2GType_Test()
	 * @model dataType="datatypedin.DatatypeC"
	 *        extendedMetaData="kind='attribute' name='test'"
	 * @generated
	 */
	String getTest();

	/**
	 * Sets the value of the '{@link basisnachricht.NachrichtG2GType#getTest <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' attribute.
	 * @see #getTest()
	 * @generated
	 */
	void setTest(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Attribut wird die Version des XÖV-Standards eingetragen, aus dem die Nachricht stammt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see basisnachricht.BasisnachrichtPackage#getNachrichtG2GType_Version()
	 * @model dataType="datatypedin.DatatypeC" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link basisnachricht.NachrichtG2GType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // NachrichtG2GType
