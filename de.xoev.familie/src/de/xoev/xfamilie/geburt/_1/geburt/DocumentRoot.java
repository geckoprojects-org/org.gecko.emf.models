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
package de.xoev.xfamilie.geburt._1.geburt;

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
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeAlleinsorgeAntrag0801 <em>Sorge Alleinsorge Antrag0801</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeAlleinsorgeAuskunft0803 <em>Sorge Alleinsorge Auskunft0803</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeErklaerungVorbeitung0802 <em>Sorge Erklaerung Vorbeitung0802</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeNachweisregisterEintragung0804 <em>Sorge Nachweisregister Eintragung0804</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeNachweisregisterKorrektur0805 <em>Sorge Nachweisregister Korrektur0805</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeNachweisregisterLoeschung0806 <em>Sorge Nachweisregister Loeschung0806</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getDocumentRoot()
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
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getDocumentRoot_Mixed()
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
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Sorge Alleinsorge Antrag0801</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hierbei handelt es sich um den Antrag auf Auskunft über die Alleinsorge aus dem Sorgeregister nach § 58 SGB VIII. Liegen keine Eintragungen im Sorgeregister vor, so erhält die mit dem Vater des Kindes nicht verheiratete Mutter auf Antrag hierüber eine schriftliche Auskunft ("Negativattest) von dem nach § 87c Absatz 6 Satz 1 zuständigen Jugendamt ("Geburtsjugendamt").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sorge Alleinsorge Antrag0801</em>' containment reference.
	 * @see #setSorgeAlleinsorgeAntrag0801(SorgeAlleinsorgeAntrag0801Type)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getDocumentRoot_SorgeAlleinsorgeAntrag0801()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sorge.alleinsorge.antrag.0801' namespace='##targetNamespace'"
	 * @generated
	 */
	SorgeAlleinsorgeAntrag0801Type getSorgeAlleinsorgeAntrag0801();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeAlleinsorgeAntrag0801 <em>Sorge Alleinsorge Antrag0801</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorge Alleinsorge Antrag0801</em>' containment reference.
	 * @see #getSorgeAlleinsorgeAntrag0801()
	 * @generated
	 */
	void setSorgeAlleinsorgeAntrag0801(SorgeAlleinsorgeAntrag0801Type value);

	/**
	 * Returns the value of the '<em><b>Sorge Alleinsorge Auskunft0803</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diese Nachricht dient der Übermittlung einer Auskunft nach § 58 Abs.2 S.1 SGV VIII für die nicht mit dem Vater des Kindes verheiratete Mutter. Diese Nachricht kann auch dann übermittelt werden, wenn im Sorgeregister Eintragungen vorliegen und eine Auskunft nach § 58 Abs. 2 S.1 SGB VIII nicht möglich ist. In diesen Fällen hat die Nachricht rein informativen Charakter, indem sie dem Empfänger den Grund der Nichtausstellbarkeit mitteilt (z.B. wegen Vorliegen einer Sorgeerklärung).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sorge Alleinsorge Auskunft0803</em>' containment reference.
	 * @see #setSorgeAlleinsorgeAuskunft0803(SorgeAlleinsorgeAuskunft0803Type)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getDocumentRoot_SorgeAlleinsorgeAuskunft0803()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sorge.alleinsorge.auskunft.0803' namespace='##targetNamespace'"
	 * @generated
	 */
	SorgeAlleinsorgeAuskunft0803Type getSorgeAlleinsorgeAuskunft0803();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeAlleinsorgeAuskunft0803 <em>Sorge Alleinsorge Auskunft0803</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorge Alleinsorge Auskunft0803</em>' containment reference.
	 * @see #getSorgeAlleinsorgeAuskunft0803()
	 * @generated
	 */
	void setSorgeAlleinsorgeAuskunft0803(SorgeAlleinsorgeAuskunft0803Type value);

	/**
	 * Returns the value of the '<em><b>Sorge Erklaerung Vorbeitung0802</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit dieser Nachricht werden Daten zur Vorbereitung einer öffentlichen Beurkundung einer gemeinsamen Sorgeerklärung gemäß § 1626a Abs.1 Nr.1 BGB i.V.m. § 1626d Abs.1 von den Eltern an eine beurkundende Stelle übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sorge Erklaerung Vorbeitung0802</em>' containment reference.
	 * @see #setSorgeErklaerungVorbeitung0802(SorgeErklaerungVorbeitung0802Type)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getDocumentRoot_SorgeErklaerungVorbeitung0802()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sorge.erklaerung.vorbeitung.0802' namespace='##targetNamespace'"
	 * @generated
	 */
	SorgeErklaerungVorbeitung0802Type getSorgeErklaerungVorbeitung0802();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeErklaerungVorbeitung0802 <em>Sorge Erklaerung Vorbeitung0802</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorge Erklaerung Vorbeitung0802</em>' containment reference.
	 * @see #getSorgeErklaerungVorbeitung0802()
	 * @generated
	 */
	void setSorgeErklaerungVorbeitung0802(SorgeErklaerungVorbeitung0802Type value);

	/**
	 * Returns the value of the '<em><b>Sorge Nachweisregister Eintragung0804</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit dieser Nachricht werden die für Auskunftserteilung mit der Nachricht sorge.alleinsorge.auskunft.0803 erforderlichen Daten aus einem Sorgeregister zu einem Nachweisregister übermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sorge Nachweisregister Eintragung0804</em>' containment reference.
	 * @see #setSorgeNachweisregisterEintragung0804(SorgeNachweisregisterEintragung0804Type)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getDocumentRoot_SorgeNachweisregisterEintragung0804()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sorge.nachweisregister.eintragung.0804' namespace='##targetNamespace'"
	 * @generated
	 */
	SorgeNachweisregisterEintragung0804Type getSorgeNachweisregisterEintragung0804();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeNachweisregisterEintragung0804 <em>Sorge Nachweisregister Eintragung0804</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorge Nachweisregister Eintragung0804</em>' containment reference.
	 * @see #getSorgeNachweisregisterEintragung0804()
	 * @generated
	 */
	void setSorgeNachweisregisterEintragung0804(SorgeNachweisregisterEintragung0804Type value);

	/**
	 * Returns the value of the '<em><b>Sorge Nachweisregister Korrektur0805</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit dieser Nachricht können die für Auskunftserteilung mit der Nachricht sorge.alleinsorge.auskunft.0803 erforderlichen Daten aus einem Sorgeregister zu einem Nachweisregister korrigiert werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sorge Nachweisregister Korrektur0805</em>' containment reference.
	 * @see #setSorgeNachweisregisterKorrektur0805(SorgeNachweisregisterKorrektur0805Type)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getDocumentRoot_SorgeNachweisregisterKorrektur0805()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sorge.nachweisregister.korrektur.0805' namespace='##targetNamespace'"
	 * @generated
	 */
	SorgeNachweisregisterKorrektur0805Type getSorgeNachweisregisterKorrektur0805();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeNachweisregisterKorrektur0805 <em>Sorge Nachweisregister Korrektur0805</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorge Nachweisregister Korrektur0805</em>' containment reference.
	 * @see #getSorgeNachweisregisterKorrektur0805()
	 * @generated
	 */
	void setSorgeNachweisregisterKorrektur0805(SorgeNachweisregisterKorrektur0805Type value);

	/**
	 * Returns the value of the '<em><b>Sorge Nachweisregister Loeschung0806</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wird diese Nachricht ausgelöst, ist der Datensatz im Nachweisregister vollständig zu entfernen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sorge Nachweisregister Loeschung0806</em>' containment reference.
	 * @see #setSorgeNachweisregisterLoeschung0806(SorgeNachweisregisterLoeschung0806Type)
	 * @see de.xoev.xfamilie.geburt._1.geburt.GeburtPackage#getDocumentRoot_SorgeNachweisregisterLoeschung0806()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sorge.nachweisregister.loeschung.0806' namespace='##targetNamespace'"
	 * @generated
	 */
	SorgeNachweisregisterLoeschung0806Type getSorgeNachweisregisterLoeschung0806();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.geburt._1.geburt.DocumentRoot#getSorgeNachweisregisterLoeschung0806 <em>Sorge Nachweisregister Loeschung0806</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorge Nachweisregister Loeschung0806</em>' containment reference.
	 * @see #getSorgeNachweisregisterLoeschung0806()
	 * @generated
	 */
	void setSorgeNachweisregisterLoeschung0806(SorgeNachweisregisterLoeschung0806Type value);

} // DocumentRoot
