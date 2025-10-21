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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType;
import de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elterngeldantrag Antrag0201 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getKind <em>Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getElterngeldantrag <em>Elterngeldantrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getGesamteinkommen <em>Gesamteinkommen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getElternteilEins <em>Elternteil Eins</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getElternteilZwei <em>Elternteil Zwei</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getMutterschaftsgeldArbeitgeberzuschussVglLeistungen <em>Mutterschaftsgeld Arbeitgeberzuschuss Vgl Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getWeitereKinderImHaushalt <em>Weitere Kinder Im Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getNachweisdokumentAntragsservice <em>Nachweisdokument Antragsservice</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getPdfAntrag <em>Pdf Antrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getNachweisdokumentAntragsteller <em>Nachweisdokument Antragsteller</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getDatenabruf <em>Datenabruf</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAntrag0201Type()
 * @model extendedMetaData="name='elterngeldantrag.antrag.0201_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ElterngeldantragAntrag0201Type extends AntragsnachrichtType {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Kind oder den Kindern, für die Elterngeld beantragt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(KindElterngeldType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAntrag0201Type_Kind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kind' namespace='##targetNamespace'"
	 * @generated
	 */
	KindElterngeldType getKind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(KindElterngeldType value);

	/**
	 * Returns the value of the '<em><b>Elterngeldantrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten dazu, welche Elternteile den Antrag stellen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elterngeldantrag</em>' containment reference.
	 * @see #setElterngeldantrag(CodeElterngeldantragType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAntrag0201Type_Elterngeldantrag()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='elterngeldantrag' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeElterngeldantragType getElterngeldantrag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getElterngeldantrag <em>Elterngeldantrag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elterngeldantrag</em>' containment reference.
	 * @see #getElterngeldantrag()
	 * @generated
	 */
	void setElterngeldantrag(CodeElterngeldantragType value);

	/**
	 * Returns the value of the '<em><b>Gesamteinkommen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Gesamteinkommen im letzten steuerlichen Veranlagungszeitraum der Elternteile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gesamteinkommen</em>' containment reference.
	 * @see #setGesamteinkommen(CodeGesamteinkommenType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAntrag0201Type_Gesamteinkommen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='gesamteinkommen' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeGesamteinkommenType getGesamteinkommen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getGesamteinkommen <em>Gesamteinkommen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gesamteinkommen</em>' containment reference.
	 * @see #getGesamteinkommen()
	 * @generated
	 */
	void setGesamteinkommen(CodeGesamteinkommenType value);

	/**
	 * Returns the value of the '<em><b>Elternteil Eins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Elternteil, der Elterngeld beantragt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elternteil Eins</em>' containment reference.
	 * @see #setElternteilEins(ElternteilEinsElterngeldantragType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAntrag0201Type_ElternteilEins()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='elternteilEins' namespace='##targetNamespace'"
	 * @generated
	 */
	ElternteilEinsElterngeldantragType getElternteilEins();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getElternteilEins <em>Elternteil Eins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elternteil Eins</em>' containment reference.
	 * @see #getElternteilEins()
	 * @generated
	 */
	void setElternteilEins(ElternteilEinsElterngeldantragType value);

	/**
	 * Returns the value of the '<em><b>Elternteil Zwei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum zweiten Elternteil. Diese Angaben sind optional, da auch ein einzelner Elternteil den Antrag stellen kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elternteil Zwei</em>' containment reference.
	 * @see #setElternteilZwei(ElternteilZweiElterngeldantragType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAntrag0201Type_ElternteilZwei()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='elternteilZwei' namespace='##targetNamespace'"
	 * @generated
	 */
	ElternteilZweiElterngeldantragType getElternteilZwei();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getElternteilZwei <em>Elternteil Zwei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elternteil Zwei</em>' containment reference.
	 * @see #getElternteilZwei()
	 * @generated
	 */
	void setElternteilZwei(ElternteilZweiElterngeldantragType value);

	/**
	 * Returns the value of the '<em><b>Mutterschaftsgeld Arbeitgeberzuschuss Vgl Leistungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu Mutterschaftsgeld, Arbeitgeberzuschuss und vergleichbaren Leistungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mutterschaftsgeld Arbeitgeberzuschuss Vgl Leistungen</em>' containment reference.
	 * @see #setMutterschaftsgeldArbeitgeberzuschussVglLeistungen(MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAntrag0201Type_MutterschaftsgeldArbeitgeberzuschussVglLeistungen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mutterschaftsgeldArbeitgeberzuschussVglLeistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType getMutterschaftsgeldArbeitgeberzuschussVglLeistungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getMutterschaftsgeldArbeitgeberzuschussVglLeistungen <em>Mutterschaftsgeld Arbeitgeberzuschuss Vgl Leistungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutterschaftsgeld Arbeitgeberzuschuss Vgl Leistungen</em>' containment reference.
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVglLeistungen()
	 * @generated
	 */
	void setMutterschaftsgeldArbeitgeberzuschussVglLeistungen(MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType value);

	/**
	 * Returns the value of the '<em><b>Weitere Kinder Im Haushalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu weiteren Kindern im Haushalt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weitere Kinder Im Haushalt</em>' containment reference.
	 * @see #setWeitereKinderImHaushalt(WeitereKinderType)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAntrag0201Type_WeitereKinderImHaushalt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='weitereKinderImHaushalt' namespace='##targetNamespace'"
	 * @generated
	 */
	WeitereKinderType getWeitereKinderImHaushalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type#getWeitereKinderImHaushalt <em>Weitere Kinder Im Haushalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weitere Kinder Im Haushalt</em>' containment reference.
	 * @see #getWeitereKinderImHaushalt()
	 * @generated
	 */
	void setWeitereKinderImHaushalt(WeitereKinderType value);

	/**
	 * Returns the value of the '<em><b>Nachweisdokument Antragsservice</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vom Antragsservice selbst erstellte Nachweisdokumente zur Ablage in der Akte der Fachbehörde. Beispiel: Die Willenserklärung eines oder der Antragstellenden "im Original".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweisdokument Antragsservice</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAntrag0201Type_NachweisdokumentAntragsservice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisdokument.antragsservice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisdokumentAntragsservice();

	/**
	 * Returns the value of the '<em><b>Pdf Antrag</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pdf Antrag</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAntrag0201Type_PdfAntrag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pdfAntrag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getPdfAntrag();

	/**
	 * Returns the value of the '<em><b>Nachweisdokument Antragsteller</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweisdokument Antragsteller</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAntrag0201Type_NachweisdokumentAntragsteller()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nachweisdokument.antragsteller' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NachweisdokumentType> getNachweisdokumentAntragsteller();

	/**
	 * Returns the value of the '<em><b>Datenabruf</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenabruf</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getElterngeldantragAntrag0201Type_Datenabruf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datenabruf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatenabrufType> getDatenabruf();

} // ElterngeldantragAntrag0201Type
