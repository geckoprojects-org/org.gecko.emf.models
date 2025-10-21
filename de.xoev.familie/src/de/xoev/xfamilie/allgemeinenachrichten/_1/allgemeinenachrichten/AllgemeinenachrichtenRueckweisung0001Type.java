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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten;

import de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allgemeinenachrichten Rueckweisung0001 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getRueckweisendeStelle <em>Rueckweisende Stelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getRueckweisungsgrund <em>Rueckweisungsgrund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getTransportinformationen <em>Transportinformationen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getIdentifikationNachricht <em>Identifikation Nachricht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getNachricht <em>Nachricht</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getAllgemeinenachrichtenRueckweisung0001Type()
 * @model extendedMetaData="name='allgemeinenachrichten.rueckweisung.0001_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AllgemeinenachrichtenRueckweisung0001Type extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Rueckweisende Stelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Kindelement ist nur dann zu übermitteln, wenn die Nachricht nicht von dem ursprünglich adressierten Leser zurückgesandt wird, sondern von einer anderen Stelle (zum Beispiel einer Clearingstelle, die im Auftrag der ursprünglich adressierten Behörde eine Prüfung eingehender Nachrichten nach formalen Kriterien durchführt).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rueckweisende Stelle</em>' containment reference.
	 * @see #setRueckweisendeStelle(RueckweisendeStelleType)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getAllgemeinenachrichtenRueckweisung0001Type_RueckweisendeStelle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rueckweisendeStelle' namespace='##targetNamespace'"
	 * @generated
	 */
	RueckweisendeStelleType getRueckweisendeStelle();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getRueckweisendeStelle <em>Rueckweisende Stelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rueckweisende Stelle</em>' containment reference.
	 * @see #getRueckweisendeStelle()
	 * @generated
	 */
	void setRueckweisendeStelle(RueckweisendeStelleType value);

	/**
	 * Returns the value of the '<em><b>Rueckweisungsgrund</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisungsgrundType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Element werden die Gründe mitgeteilt, aufgrund derer die Nachricht zurückgewiesen wird. Generell ist so vorzugehen, dass die Gründe für die Rückweisung so präzise und vollständig wie möglich bezeichnet werden, um eine schnelle Klärung des Sachverhalts zu ermöglichen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rueckweisungsgrund</em>' containment reference list.
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getAllgemeinenachrichtenRueckweisung0001Type_Rueckweisungsgrund()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rueckweisungsgrund' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RueckweisungsgrundType> getRueckweisungsgrund();

	/**
	 * Returns the value of the '<em><b>Transportinformationen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Element sind Informationen zu übermitteln, die bei dem Empfang einer als fehlerhaft betrachteten Nachricht möglicherweise der Transportebene entnommen werden konnten. Diese Angaben können gemacht werden, um dem Leser oder Empfänger einer Rücksendenachricht die Identifikation der als fehlerhaft betrachteten und nunmehr zurückgesandten Nachricht zu erleichtern. Alle Kindelemente dieses Elementes sind optional, da keine verbindlichen Anforderungen an das Transportprotokoll gestellt werden können.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transportinformationen</em>' containment reference.
	 * @see #setTransportinformationen(TransportinformationenType)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getAllgemeinenachrichtenRueckweisung0001Type_Transportinformationen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transportinformationen' namespace='##targetNamespace'"
	 * @generated
	 */
	TransportinformationenType getTransportinformationen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getTransportinformationen <em>Transportinformationen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transportinformationen</em>' containment reference.
	 * @see #getTransportinformationen()
	 * @generated
	 */
	void setTransportinformationen(TransportinformationenType value);

	/**
	 * Returns the value of the '<em><b>Identifikation Nachricht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Kindelement wird die die Rückweisung auslösende fachliche Nachricht identifiziert. Sofern kein Transportfehler vorliegt und die Ursprungsnachricht schemakonform ist, muss das Element übermittelt werden. Ist die Ursprungsnachricht nicht schemakonform, kann die Übermittlung des Elements entfallen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifikation Nachricht</em>' containment reference.
	 * @see #setIdentifikationNachricht(IdentifikationNachrichtType)
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getAllgemeinenachrichtenRueckweisung0001Type_IdentifikationNachricht()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifikation.nachricht' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifikationNachrichtType getIdentifikationNachricht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getIdentifikationNachricht <em>Identifikation Nachricht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifikation Nachricht</em>' containment reference.
	 * @see #getIdentifikationNachricht()
	 * @generated
	 */
	void setIdentifikationNachricht(IdentifikationNachrichtType value);

	/**
	 * Returns the value of the '<em><b>Nachricht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält die aus den genannten Gründen zurückgewiesene ursprüngliche Nachricht. Um technische Probleme mit verschachtelten XML-Dokumenten zu vermeiden, ist der zurückgewiesene Inhalt immer base64-codiert zurückzusenden. Dieses Element ist nur anzugeben, wenn die zurückgewiesene Nachricht nicht schema-konform ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachricht</em>' attribute.
	 * @see #setNachricht(byte[])
	 * @see de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage#getAllgemeinenachrichtenRueckweisung0001Type_Nachricht()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element' name='nachricht' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getNachricht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type#getNachricht <em>Nachricht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachricht</em>' attribute.
	 * @see #getNachricht()
	 * @generated
	 */
	void setNachricht(byte[] value);

} // AllgemeinenachrichtenRueckweisung0001Type
