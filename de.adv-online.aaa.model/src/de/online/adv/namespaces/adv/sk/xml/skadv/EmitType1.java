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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emit Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#getLabelText <em>Label Text</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#getZIndex <em>ZIndex</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#isPermitApDarst <em>Permit Ap Darst</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#isPermitPraesobj <em>Permit Praesobj</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#isPermitStdpraes <em>Permit Stdpraes</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#getSymbolClass <em>Symbol Class</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#getDesignRule <em>Design Rule</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#getSymbolizer <em>Symbolizer</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType1()
 * @model extendedMetaData="name='EmitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EmitType1 extends ElementType1 {
	/**
	 * Returns the value of the '<em><b>Label Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Rolle labelText etabliert einen Default für die Textinhalte aller im referierten Symbolizer enthaltenen Label-Objekte. Diese können in diesem Fall auf die individuelle Angabe eines Label-Textes verzichten. Wenn sie trotzdem einen solchen spezifizieren, so überschreibt dieser die Angabe beim Emit. An einer der beiden Stellen muss der Textinhalt aber angegeben sein, ansonsten liegt eine Fehlersituation vor.
	 * 
	 * Wird die Darstellung eines Präsentationsobjekts beschrieben - erkennbar am featureTypeName des Filter-Objekts - so gilt folgende Sonderfunktionalität: Enthält dieses Objekt Schriftinhalt (Attribut "schriftinhalt"), so wirkt diese automatisch als Default für die Angabe des labelText im Emit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Text</em>' containment reference.
	 * @see #setLabelText(LabelTextType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType1_LabelText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='labelText' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelTextType1 getLabelText();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#getLabelText <em>Label Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Text</em>' containment reference.
	 * @see #getLabelText()
	 * @generated
	 */
	void setLabelText(LabelTextType1 value);

	/**
	 * Returns the value of the '<em><b>ZIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der zIndex steuert die Darstellungspriorität. Wird der zIndex im Emit angegeben, so überschreibt er alle zIndex-Angaben in den konkreten Symbolizers, die im Kontext des Emit zur Ausführung gelangen.
	 * 
	 * Wird die Darstellung eines Präsentationsobjekts beschrieben - erkennbar am featureTypeName des Filter-Objekts - so gilt folgende Sonderfunktionalität: Enthält dieses Objekt eine Darstellungspriorität, so überschreibt diese die Angabe im zIndex-Attribut.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZIndex</em>' attribute.
	 * @see #setZIndex(BigInteger)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType1_ZIndex()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='zIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getZIndex();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#getZIndex <em>ZIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZIndex</em>' attribute.
	 * @see #getZIndex()
	 * @generated
	 */
	void setZIndex(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Permit Ap Darst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der logische Wert erlaubt oder verbietet den Einsatz von AP_Darstellung für dieses Emit.
	 * 
	 * Der Defaultwert ist "true".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permit Ap Darst</em>' attribute.
	 * @see #isSetPermitApDarst()
	 * @see #unsetPermitApDarst()
	 * @see #setPermitApDarst(boolean)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType1_PermitApDarst()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='permit_ap_darst' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPermitApDarst();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#isPermitApDarst <em>Permit Ap Darst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permit Ap Darst</em>' attribute.
	 * @see #isSetPermitApDarst()
	 * @see #unsetPermitApDarst()
	 * @see #isPermitApDarst()
	 * @generated
	 */
	void setPermitApDarst(boolean value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#isPermitApDarst <em>Permit Ap Darst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPermitApDarst()
	 * @see #isPermitApDarst()
	 * @see #setPermitApDarst(boolean)
	 * @generated
	 */
	void unsetPermitApDarst();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#isPermitApDarst <em>Permit Ap Darst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Permit Ap Darst</em>' attribute is set.
	 * @see #unsetPermitApDarst()
	 * @see #isPermitApDarst()
	 * @see #setPermitApDarst(boolean)
	 * @generated
	 */
	boolean isSetPermitApDarst();

	/**
	 * Returns the value of the '<em><b>Permit Praesobj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der logische Wert erlaubt oder verbietet den Einsatz von Präsentationsobjekten für dieses Emit.
	 * 
	 * Der Defaultwert ist "true".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permit Praesobj</em>' attribute.
	 * @see #isSetPermitPraesobj()
	 * @see #unsetPermitPraesobj()
	 * @see #setPermitPraesobj(boolean)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType1_PermitPraesobj()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='permit_praesobj' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPermitPraesobj();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#isPermitPraesobj <em>Permit Praesobj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permit Praesobj</em>' attribute.
	 * @see #isSetPermitPraesobj()
	 * @see #unsetPermitPraesobj()
	 * @see #isPermitPraesobj()
	 * @generated
	 */
	void setPermitPraesobj(boolean value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#isPermitPraesobj <em>Permit Praesobj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPermitPraesobj()
	 * @see #isPermitPraesobj()
	 * @see #setPermitPraesobj(boolean)
	 * @generated
	 */
	void unsetPermitPraesobj();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#isPermitPraesobj <em>Permit Praesobj</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Permit Praesobj</em>' attribute is set.
	 * @see #unsetPermitPraesobj()
	 * @see #isPermitPraesobj()
	 * @see #setPermitPraesobj(boolean)
	 * @generated
	 */
	boolean isSetPermitPraesobj();

	/**
	 * Returns the value of the '<em><b>Permit Stdpraes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der logische Wert erlaubt oder verbietet den Einsatz einer Standardpräsentation für dieses Emit.
	 * 
	 * Der Defaultwert ist "true".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permit Stdpraes</em>' attribute.
	 * @see #isSetPermitStdpraes()
	 * @see #unsetPermitStdpraes()
	 * @see #setPermitStdpraes(boolean)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType1_PermitStdpraes()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='permit_stdpraes' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPermitStdpraes();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#isPermitStdpraes <em>Permit Stdpraes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permit Stdpraes</em>' attribute.
	 * @see #isSetPermitStdpraes()
	 * @see #unsetPermitStdpraes()
	 * @see #isPermitStdpraes()
	 * @generated
	 */
	void setPermitStdpraes(boolean value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#isPermitStdpraes <em>Permit Stdpraes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPermitStdpraes()
	 * @see #isPermitStdpraes()
	 * @see #setPermitStdpraes(boolean)
	 * @generated
	 */
	void unsetPermitStdpraes();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#isPermitStdpraes <em>Permit Stdpraes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Permit Stdpraes</em>' attribute is set.
	 * @see #unsetPermitStdpraes()
	 * @see #isPermitStdpraes()
	 * @see #setPermitStdpraes(boolean)
	 * @generated
	 */
	boolean isSetPermitStdpraes();

	/**
	 * Returns the value of the '<em><b>Symbol Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die "Art der Signatur" stellt im ATKIS-SK ein Selektionskriterium für die implizite Unterdrückung der Ausgabe des Fachobjekts dar, wenn Präsentationsobjekte vorhanden sind. Nur Präsentationsobjekte derselben "Art der Signatur" unterdrücken ein Emit.
	 * 
	 * Obwohl die Werte von "symbolClass" als freier Text modelliert sind, sollte darauf geachtet werden, dass ein Überblick über die möglichen Symbolarten gewonnen und behalten wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbol Class</em>' attribute.
	 * @see #setSymbolClass(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType1_SymbolClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='symbolClass' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSymbolClass();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1#getSymbolClass <em>Symbol Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Class</em>' attribute.
	 * @see #getSymbolClass()
	 * @generated
	 */
	void setSymbolClass(String value);

	/**
	 * Returns the value of the '<em><b>Design Rule</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.DesignRuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Rolle bestimmt die vom Emit referierten DesignRule-Objekte. Falls diese komplett durch PlacementRules beschrieben wurden, soll es nur höchstens eine einzige DesignRule am Emit geben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Rule</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType1_DesignRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designRule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DesignRuleType> getDesignRule();

	/**
	 * Returns the value of the '<em><b>Symbolizer</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Über die Rolle "symbolizer" ist ein Emit mit einem oder mehreren Symbolizer-Objekten verbunden. Diese werden, falls sie nicht durch ein Prädikat unterdrückt werden, in der angegebenen Reihenfolge auf die Objektgeometrie ($geometry) angewandt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbolizer</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType1_Symbolizer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='symbolizer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SymbolizerType> getSymbolizer();

} // EmitType1
