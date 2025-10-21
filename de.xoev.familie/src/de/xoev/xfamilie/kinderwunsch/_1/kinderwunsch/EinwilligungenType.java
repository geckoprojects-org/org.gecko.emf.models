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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Einwilligungen Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungZurAuskunftseinholung <em>Einwilligung Zur Auskunftseinholung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungZurAuskunftseinholungEinschraenkungen <em>Einwilligung Zur Auskunftseinholung Einschraenkungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEntbindungSchweigepflichtDerAerzte <em>Entbindung Schweigepflicht Der Aerzte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungKostenuebernahmeregelungBehandlungsabbruch <em>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isDatenschutzerklaerungHerbeifuehrungSchwangerschaft <em>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getEinwilligungenType()
 * @model extendedMetaData="name='EinwilligungenType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EinwilligungenType extends EObject {
	/**
	 * Returns the value of the '<em><b>Einwilligung Zur Auskunftseinholung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Einwilligung Zur Auskunftseinholung</em>' attribute.
	 * @see #isSetEinwilligungZurAuskunftseinholung()
	 * @see #unsetEinwilligungZurAuskunftseinholung()
	 * @see #setEinwilligungZurAuskunftseinholung(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getEinwilligungenType_EinwilligungZurAuskunftseinholung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='einwilligungZurAuskunftseinholung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinwilligungZurAuskunftseinholung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungZurAuskunftseinholung <em>Einwilligung Zur Auskunftseinholung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einwilligung Zur Auskunftseinholung</em>' attribute.
	 * @see #isSetEinwilligungZurAuskunftseinholung()
	 * @see #unsetEinwilligungZurAuskunftseinholung()
	 * @see #isEinwilligungZurAuskunftseinholung()
	 * @generated
	 */
	void setEinwilligungZurAuskunftseinholung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungZurAuskunftseinholung <em>Einwilligung Zur Auskunftseinholung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinwilligungZurAuskunftseinholung()
	 * @see #isEinwilligungZurAuskunftseinholung()
	 * @see #setEinwilligungZurAuskunftseinholung(boolean)
	 * @generated
	 */
	void unsetEinwilligungZurAuskunftseinholung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungZurAuskunftseinholung <em>Einwilligung Zur Auskunftseinholung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einwilligung Zur Auskunftseinholung</em>' attribute is set.
	 * @see #unsetEinwilligungZurAuskunftseinholung()
	 * @see #isEinwilligungZurAuskunftseinholung()
	 * @see #setEinwilligungZurAuskunftseinholung(boolean)
	 * @generated
	 */
	boolean isSetEinwilligungZurAuskunftseinholung();

	/**
	 * Returns the value of the '<em><b>Einwilligung Zur Auskunftseinholung Einschraenkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Einwilligung Zur Auskunftseinholung Einschraenkungen</em>' attribute.
	 * @see #isSetEinwilligungZurAuskunftseinholungEinschraenkungen()
	 * @see #unsetEinwilligungZurAuskunftseinholungEinschraenkungen()
	 * @see #setEinwilligungZurAuskunftseinholungEinschraenkungen(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getEinwilligungenType_EinwilligungZurAuskunftseinholungEinschraenkungen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='einwilligungZurAuskunftseinholungEinschraenkungen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinwilligungZurAuskunftseinholungEinschraenkungen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungZurAuskunftseinholungEinschraenkungen <em>Einwilligung Zur Auskunftseinholung Einschraenkungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einwilligung Zur Auskunftseinholung Einschraenkungen</em>' attribute.
	 * @see #isSetEinwilligungZurAuskunftseinholungEinschraenkungen()
	 * @see #unsetEinwilligungZurAuskunftseinholungEinschraenkungen()
	 * @see #isEinwilligungZurAuskunftseinholungEinschraenkungen()
	 * @generated
	 */
	void setEinwilligungZurAuskunftseinholungEinschraenkungen(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungZurAuskunftseinholungEinschraenkungen <em>Einwilligung Zur Auskunftseinholung Einschraenkungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinwilligungZurAuskunftseinholungEinschraenkungen()
	 * @see #isEinwilligungZurAuskunftseinholungEinschraenkungen()
	 * @see #setEinwilligungZurAuskunftseinholungEinschraenkungen(boolean)
	 * @generated
	 */
	void unsetEinwilligungZurAuskunftseinholungEinschraenkungen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungZurAuskunftseinholungEinschraenkungen <em>Einwilligung Zur Auskunftseinholung Einschraenkungen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einwilligung Zur Auskunftseinholung Einschraenkungen</em>' attribute is set.
	 * @see #unsetEinwilligungZurAuskunftseinholungEinschraenkungen()
	 * @see #isEinwilligungZurAuskunftseinholungEinschraenkungen()
	 * @see #setEinwilligungZurAuskunftseinholungEinschraenkungen(boolean)
	 * @generated
	 */
	boolean isSetEinwilligungZurAuskunftseinholungEinschraenkungen();

	/**
	 * Returns the value of the '<em><b>Entbindung Schweigepflicht Der Aerzte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entbindung Schweigepflicht Der Aerzte</em>' attribute.
	 * @see #isSetEntbindungSchweigepflichtDerAerzte()
	 * @see #unsetEntbindungSchweigepflichtDerAerzte()
	 * @see #setEntbindungSchweigepflichtDerAerzte(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getEinwilligungenType_EntbindungSchweigepflichtDerAerzte()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='entbindungSchweigepflichtDerAerzte' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEntbindungSchweigepflichtDerAerzte();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEntbindungSchweigepflichtDerAerzte <em>Entbindung Schweigepflicht Der Aerzte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entbindung Schweigepflicht Der Aerzte</em>' attribute.
	 * @see #isSetEntbindungSchweigepflichtDerAerzte()
	 * @see #unsetEntbindungSchweigepflichtDerAerzte()
	 * @see #isEntbindungSchweigepflichtDerAerzte()
	 * @generated
	 */
	void setEntbindungSchweigepflichtDerAerzte(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEntbindungSchweigepflichtDerAerzte <em>Entbindung Schweigepflicht Der Aerzte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEntbindungSchweigepflichtDerAerzte()
	 * @see #isEntbindungSchweigepflichtDerAerzte()
	 * @see #setEntbindungSchweigepflichtDerAerzte(boolean)
	 * @generated
	 */
	void unsetEntbindungSchweigepflichtDerAerzte();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEntbindungSchweigepflichtDerAerzte <em>Entbindung Schweigepflicht Der Aerzte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entbindung Schweigepflicht Der Aerzte</em>' attribute is set.
	 * @see #unsetEntbindungSchweigepflichtDerAerzte()
	 * @see #isEntbindungSchweigepflichtDerAerzte()
	 * @see #setEntbindungSchweigepflichtDerAerzte(boolean)
	 * @generated
	 */
	boolean isSetEntbindungSchweigepflichtDerAerzte();

	/**
	 * Returns the value of the '<em><b>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</em>' attribute.
	 * @see #isSetEinwilligungKostenuebernahmeregelungBehandlungsabbruch()
	 * @see #unsetEinwilligungKostenuebernahmeregelungBehandlungsabbruch()
	 * @see #setEinwilligungKostenuebernahmeregelungBehandlungsabbruch(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getEinwilligungenType_EinwilligungKostenuebernahmeregelungBehandlungsabbruch()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='einwilligungKostenuebernahmeregelungBehandlungsabbruch' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinwilligungKostenuebernahmeregelungBehandlungsabbruch();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungKostenuebernahmeregelungBehandlungsabbruch <em>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</em>' attribute.
	 * @see #isSetEinwilligungKostenuebernahmeregelungBehandlungsabbruch()
	 * @see #unsetEinwilligungKostenuebernahmeregelungBehandlungsabbruch()
	 * @see #isEinwilligungKostenuebernahmeregelungBehandlungsabbruch()
	 * @generated
	 */
	void setEinwilligungKostenuebernahmeregelungBehandlungsabbruch(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungKostenuebernahmeregelungBehandlungsabbruch <em>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinwilligungKostenuebernahmeregelungBehandlungsabbruch()
	 * @see #isEinwilligungKostenuebernahmeregelungBehandlungsabbruch()
	 * @see #setEinwilligungKostenuebernahmeregelungBehandlungsabbruch(boolean)
	 * @generated
	 */
	void unsetEinwilligungKostenuebernahmeregelungBehandlungsabbruch();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungKostenuebernahmeregelungBehandlungsabbruch <em>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</em>' attribute is set.
	 * @see #unsetEinwilligungKostenuebernahmeregelungBehandlungsabbruch()
	 * @see #isEinwilligungKostenuebernahmeregelungBehandlungsabbruch()
	 * @see #setEinwilligungKostenuebernahmeregelungBehandlungsabbruch(boolean)
	 * @generated
	 */
	boolean isSetEinwilligungKostenuebernahmeregelungBehandlungsabbruch();

	/**
	 * Returns the value of the '<em><b>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</em>' attribute.
	 * @see #isSetDatenschutzerklaerungHerbeifuehrungSchwangerschaft()
	 * @see #unsetDatenschutzerklaerungHerbeifuehrungSchwangerschaft()
	 * @see #setDatenschutzerklaerungHerbeifuehrungSchwangerschaft(boolean)
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage#getEinwilligungenType_DatenschutzerklaerungHerbeifuehrungSchwangerschaft()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='datenschutzerklaerungHerbeifuehrungSchwangerschaft' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDatenschutzerklaerungHerbeifuehrungSchwangerschaft();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isDatenschutzerklaerungHerbeifuehrungSchwangerschaft <em>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</em>' attribute.
	 * @see #isSetDatenschutzerklaerungHerbeifuehrungSchwangerschaft()
	 * @see #unsetDatenschutzerklaerungHerbeifuehrungSchwangerschaft()
	 * @see #isDatenschutzerklaerungHerbeifuehrungSchwangerschaft()
	 * @generated
	 */
	void setDatenschutzerklaerungHerbeifuehrungSchwangerschaft(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isDatenschutzerklaerungHerbeifuehrungSchwangerschaft <em>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatenschutzerklaerungHerbeifuehrungSchwangerschaft()
	 * @see #isDatenschutzerklaerungHerbeifuehrungSchwangerschaft()
	 * @see #setDatenschutzerklaerungHerbeifuehrungSchwangerschaft(boolean)
	 * @generated
	 */
	void unsetDatenschutzerklaerungHerbeifuehrungSchwangerschaft();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isDatenschutzerklaerungHerbeifuehrungSchwangerschaft <em>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</em>' attribute is set.
	 * @see #unsetDatenschutzerklaerungHerbeifuehrungSchwangerschaft()
	 * @see #isDatenschutzerklaerungHerbeifuehrungSchwangerschaft()
	 * @see #setDatenschutzerklaerungHerbeifuehrungSchwangerschaft(boolean)
	 * @generated
	 */
	boolean isSetDatenschutzerklaerungHerbeifuehrungSchwangerschaft();

} // EinwilligungenType
