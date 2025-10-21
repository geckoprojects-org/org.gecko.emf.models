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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeKindschaftsbeziehungType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeTatsachenbehauptungType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anderer Elternteil Basis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum anderen Elternteil.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAnrede <em>Anrede</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getKindschaftsbeziehung <em>Kindschaftsbeziehung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAndereRegelmaessigerAufenthaltort <em>Andere Regelmaessiger Aufenthaltort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getZusammenlebendMitNeuenPartner <em>Zusammenlebend Mit Neuen Partner</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getVertretung <em>Vertretung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getVermoegen <em>Vermoegen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getEinkuenfte <em>Einkuenfte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getSonstigeLeistungen <em>Sonstige Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getTraegerKrankenversicherung <em>Traeger Krankenversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getWeitereKinder <em>Weitere Kinder</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAusbildung <em>Ausbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getLeistungsfaehig <em>Leistungsfaehig</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getWeitereAngaben <em>Weitere Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getGeschlecht <em>Geschlecht</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType()
 * @model extendedMetaData="name='AndererElternteil.BasisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AndererElternteilBasisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name des anderen Elternteils
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameOptionalType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameOptionalType getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameOptionalType value);

	/**
	 * Returns the value of the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Geburt des anderen Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(GeburtType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_Geburt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	GeburtType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(GeburtType value);

	/**
	 * Returns the value of the '<em><b>Anrede</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Anrede des anderen Elternteils. Diese kann frei gewählt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anrede</em>' attribute.
	 * @see #setAnrede(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_Anrede()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='anrede' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAnrede();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAnrede <em>Anrede</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anrede</em>' attribute.
	 * @see #getAnrede()
	 * @generated
	 */
	void setAnrede(String value);

	/**
	 * Returns the value of the '<em><b>Kindschaftsbeziehung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Kindschaftsbeziehung gibt das Verhältnis zwischen dem anderen Elternteil und dem Antragskind an. Hinweis: In späteren Versionen soll dieses Element die informationen von dem Element "Elternschaft" mitabbilden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kindschaftsbeziehung</em>' containment reference.
	 * @see #setKindschaftsbeziehung(CodeKindschaftsbeziehungType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_Kindschaftsbeziehung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kindschaftsbeziehung' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeKindschaftsbeziehungType getKindschaftsbeziehung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getKindschaftsbeziehung <em>Kindschaftsbeziehung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kindschaftsbeziehung</em>' containment reference.
	 * @see #getKindschaftsbeziehung()
	 * @generated
	 */
	void setKindschaftsbeziehung(CodeKindschaftsbeziehungType value);

	/**
	 * Returns the value of the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Anschrift des anderen Elternteils
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschrift</em>' containment reference.
	 * @see #setAnschrift(AnschriftOptionalType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_Anschrift()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='anschrift' namespace='##targetNamespace'"
	 * @generated
	 */
	AnschriftOptionalType getAnschrift();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAnschrift <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschrift</em>' containment reference.
	 * @see #getAnschrift()
	 * @generated
	 */
	void setAnschrift(AnschriftOptionalType value);

	/**
	 * Returns the value of the '<em><b>Andere Regelmaessiger Aufenthaltort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum anderen regelmäßigen Aufenthaltsort des anderen Elternteils. Regel: Falls bekannt ist, dass der andere Elternteil sich häufig nicht an seiner Anschrift aufhält.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Andere Regelmaessiger Aufenthaltort</em>' containment reference.
	 * @see #setAndereRegelmaessigerAufenthaltort(TatsacheMitFreitextType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_AndereRegelmaessigerAufenthaltort()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='andereRegelmaessigerAufenthaltort' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitFreitextType getAndereRegelmaessigerAufenthaltort();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getAndereRegelmaessigerAufenthaltort <em>Andere Regelmaessiger Aufenthaltort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Andere Regelmaessiger Aufenthaltort</em>' containment reference.
	 * @see #getAndereRegelmaessigerAufenthaltort()
	 * @generated
	 */
	void setAndereRegelmaessigerAufenthaltort(TatsacheMitFreitextType value);

	/**
	 * Returns the value of the '<em><b>Staatsangehoerigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Staatsangehörigkeiten des anderen Elternteils. Regel: Bei mehreren Staatsangehörigkeiten einer Person ist immer Deutsch/Schweiz/EU/EWR zu übertragen, wenn eine dieser besteht, ansonsten Sonstiges.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #setStaatsangehoerigkeit(StaatsangehoerigkeitAndererElternteilType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_Staatsangehoerigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staatsangehoerigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	StaatsangehoerigkeitAndererElternteilType getStaatsangehoerigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staatsangehoerigkeit</em>' containment reference.
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 */
	void setStaatsangehoerigkeit(StaatsangehoerigkeitAndererElternteilType value);

	/**
	 * Returns the value of the '<em><b>Zusammenlebend Mit Neuen Partner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier können Informationen zur Lebenssituation des anderen Elternteils übertragen werden. Lebt der andere Elternteil mit neuem Partner oder neuer Partnerin zusammen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusammenlebend Mit Neuen Partner</em>' containment reference.
	 * @see #setZusammenlebendMitNeuenPartner(CodeTatsachenbehauptungType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_ZusammenlebendMitNeuenPartner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zusammenlebendMitNeuenPartner' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeTatsachenbehauptungType getZusammenlebendMitNeuenPartner();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getZusammenlebendMitNeuenPartner <em>Zusammenlebend Mit Neuen Partner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusammenlebend Mit Neuen Partner</em>' containment reference.
	 * @see #getZusammenlebendMitNeuenPartner()
	 * @generated
	 */
	void setZusammenlebendMitNeuenPartner(CodeTatsachenbehauptungType value);

	/**
	 * Returns the value of the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Erreichbarkeit über elektronische Kommunikationskanäle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erreichbarkeit</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_Erreichbarkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='erreichbarkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ErreichbarkeitType> getErreichbarkeit();

	/**
	 * Returns the value of the '<em><b>Vertretung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Vertretung des anderen Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertretung</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_Vertretung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vertretung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VertretungType> getVertretung();

	/**
	 * Returns the value of the '<em><b>Vermoegen</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VermoegenAndererElternteilType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Vermögen des anderen Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vermoegen</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_Vermoegen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vermoegen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VermoegenAndererElternteilType> getVermoegen();

	/**
	 * Returns the value of the '<em><b>Einkuenfte</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu Einkünften des anderen Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkuenfte</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_Einkuenfte()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='einkuenfte' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EinkuenfteAndererElternteilType> getEinkuenfte();

	/**
	 * Returns the value of the '<em><b>Sonstige Leistungen</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.SonstigeLeistungAndererElternteilType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu sonstigen Leistungen des anderen Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sonstige Leistungen</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_SonstigeLeistungen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sonstigeLeistungen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SonstigeLeistungAndererElternteilType> getSonstigeLeistungen();

	/**
	 * Returns the value of the '<em><b>Traeger Krankenversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Krankenversicherungsträger des anderen Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traeger Krankenversicherung</em>' containment reference.
	 * @see #setTraegerKrankenversicherung(TraegerKrankenversicherungType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_TraegerKrankenversicherung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='traegerKrankenversicherung' namespace='##targetNamespace'"
	 * @generated
	 */
	TraegerKrankenversicherungType getTraegerKrankenversicherung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getTraegerKrankenversicherung <em>Traeger Krankenversicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traeger Krankenversicherung</em>' containment reference.
	 * @see #getTraegerKrankenversicherung()
	 * @generated
	 */
	void setTraegerKrankenversicherung(TraegerKrankenversicherungType value);

	/**
	 * Returns the value of the '<em><b>Weitere Kinder</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu weiteren nicht gemeinsamen Kindern des anderen Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weitere Kinder</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_WeitereKinder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weitereKinder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WeitereKinderAndererElternteilType> getWeitereKinder();

	/**
	 * Returns the value of the '<em><b>Ausbildung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AusbildungAndererElternteilType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Ausbildung des anderen Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausbildung</em>' containment reference list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_Ausbildung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ausbildung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AusbildungAndererElternteilType> getAusbildung();

	/**
	 * Returns the value of the '<em><b>Leistungsfaehig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten mit bekannten Informationen und Gründen für eine bestehende oder nicht bestehende Leistungsfähigkeit des anderen Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leistungsfaehig</em>' attribute.
	 * @see #setLeistungsfaehig(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_Leistungsfaehig()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='leistungsfaehig' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLeistungsfaehig();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getLeistungsfaehig <em>Leistungsfaehig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leistungsfaehig</em>' attribute.
	 * @see #getLeistungsfaehig()
	 * @generated
	 */
	void setLeistungsfaehig(String value);

	/**
	 * Returns the value of the '<em><b>Weitere Angaben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weitere Angaben zum anderen Elternteil.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weitere Angaben</em>' containment reference.
	 * @see #setWeitereAngaben(TatsacheMitFreitextType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_WeitereAngaben()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weitereAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitFreitextType getWeitereAngaben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getWeitereAngaben <em>Weitere Angaben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weitere Angaben</em>' containment reference.
	 * @see #getWeitereAngaben()
	 * @generated
	 */
	void setWeitereAngaben(TatsacheMitFreitextType value);

	/**
	 * Returns the value of the '<em><b>Geschlecht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Bereich UVG müssen Statistiken abgegeben werden, die sich auch auf das Geschlecht des Antragsteller beziehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschlecht</em>' containment reference.
	 * @see #setGeschlecht(CodeGeschlechtType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getAndererElternteilBasisType_Geschlecht()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geschlecht' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeGeschlechtType getGeschlecht();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AndererElternteilBasisType#getGeschlecht <em>Geschlecht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschlecht</em>' containment reference.
	 * @see #getGeschlecht()
	 * @generated
	 */
	void setGeschlecht(CodeGeschlechtType value);

} // AndererElternteilBasisType
