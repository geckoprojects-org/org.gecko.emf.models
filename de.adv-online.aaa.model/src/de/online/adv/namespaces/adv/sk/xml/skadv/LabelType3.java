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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getLabelText <em>Label Text</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getSize <em>Size</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getTextDecoration <em>Text Decoration</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getScalefactor <em>Scalefactor</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getFont <em>Font</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getTextBodyFill <em>Text Body Fill</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getHalo <em>Halo</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType3()
 * @model extendedMetaData="name='LabelType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LabelType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die labelText-Rolle liefert den eigentlichen Textinhalt. Der Textinhalt wird als Expression angegeben und kann daher wahlweise Dateninhalte repräsentieren oder konstantenText.
	 * 
	 * Wird die Angabe weggelassen, so kommt die entsprechende Angabe im zugehörigen Emit-Objekt zum Tragen. Diese stellt somit einen Default zur Verfügung. Fehlt die Angabe an beiden Stellen, so ist dies eine Fehlersituation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Text</em>' containment reference.
	 * @see #setLabelText(LabelTextType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType3_LabelText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='labelText' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelTextType getLabelText();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getLabelText <em>Label Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Text</em>' containment reference.
	 * @see #getLabelText()
	 * @generated
	 */
	void setLabelText(LabelTextType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "size" definiert die Größe der Texte von der Grundlinie bis zur Höhe der Zeichen in Großschreibung (Versalhöhe).
	 * 
	 * Die Einheit ist die durch "mapCharSizeFactor" vorgegebene. Deren Default entspricht 1 DPD-Punkt.
	 * 
	 * Defaultwert ist 9.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType3_Size()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(double)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(double)
	 * @generated
	 */
	boolean isSetSize();

	/**
	 * Returns the value of the '<em><b>Text Decoration</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.TextDecorationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "textDecoration" stattet den Text mit einer zusätzlichen begleitenden Linie aus. Die Art der Ausgestaltung wird durch einen Wert des Enums TextDecoration angegeben.
	 * 
	 * Defaultwert ist "none", also keine solche Ausgestaltung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Decoration</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TextDecorationType
	 * @see #isSetTextDecoration()
	 * @see #unsetTextDecoration()
	 * @see #setTextDecoration(TextDecorationType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType3_TextDecoration()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='textDecoration' namespace='##targetNamespace'"
	 * @generated
	 */
	TextDecorationType getTextDecoration();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getTextDecoration <em>Text Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Decoration</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TextDecorationType
	 * @see #isSetTextDecoration()
	 * @see #unsetTextDecoration()
	 * @see #getTextDecoration()
	 * @generated
	 */
	void setTextDecoration(TextDecorationType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getTextDecoration <em>Text Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextDecoration()
	 * @see #getTextDecoration()
	 * @see #setTextDecoration(TextDecorationType)
	 * @generated
	 */
	void unsetTextDecoration();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getTextDecoration <em>Text Decoration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Decoration</em>' attribute is set.
	 * @see #unsetTextDecoration()
	 * @see #getTextDecoration()
	 * @see #setTextDecoration(TextDecorationType)
	 * @generated
	 */
	boolean isSetTextDecoration();

	/**
	 * Returns the value of the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das spacing-Attribut steuert die Sperrung des durch ein Label-Objekt beschriebenen Texts. Die Sperrung beschreibt die Größe des zwischen die Zeichen einzusetzenden zusätzlichen Leeraums. 
	 * 
	 * Die Einheit ist die durch "mapCharSizeFactor" vorgegebene. Deren Default entspricht 1 DPD-Punkt.
	 * 
	 * Fehlt das Attribut wird 0 angenommen.
	 * 
	 * Wird die Darstellung eines Präsentationsobjekts beschrieben - erkennbar am featureTypeName des Filter-Objekts - so gilt folgende Sonderfunktionalität: Enthält dieses Objekt eine Sperrung (Attribut "fontSperrung"), so überschreibt diese die Angabe im spacing-Attribut.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spacing</em>' attribute.
	 * @see #isSetSpacing()
	 * @see #unsetSpacing()
	 * @see #setSpacing(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType3_Spacing()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='spacing' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSpacing();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getSpacing <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacing</em>' attribute.
	 * @see #isSetSpacing()
	 * @see #unsetSpacing()
	 * @see #getSpacing()
	 * @generated
	 */
	void setSpacing(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getSpacing <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpacing()
	 * @see #getSpacing()
	 * @see #setSpacing(double)
	 * @generated
	 */
	void unsetSpacing();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getSpacing <em>Spacing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spacing</em>' attribute is set.
	 * @see #unsetSpacing()
	 * @see #getSpacing()
	 * @see #setSpacing(double)
	 * @generated
	 */
	boolean isSetSpacing();

	/**
	 * Returns the value of the '<em><b>Scalefactor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das scalefactor-Attribut steuert die Skalierung (Vergrößerung/Verkleinerung) eines Label gegenüber seiner Definition. Die Skalierung erfolgt ausgehend vom Bezugspunkt des Textes. Sie wird angegeben als Skalierungsfaktor. Fehlt das Attribut wird 1.0 angenommen.
	 * 
	 * Wird die Darstellung eines Präsentationsobjekts beschrieben - erkennbar am featureTypeName des Filter-Objekts - so gilt folgende Sonderfunktionalität: Enthält dieses Objekt eine Skalierung (Attribut "skalierung"), so überschreibt diese die Angabe im scalefactor-Attribut.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scalefactor</em>' attribute.
	 * @see #isSetScalefactor()
	 * @see #unsetScalefactor()
	 * @see #setScalefactor(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType3_Scalefactor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='scalefactor' namespace='##targetNamespace'"
	 * @generated
	 */
	double getScalefactor();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getScalefactor <em>Scalefactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalefactor</em>' attribute.
	 * @see #isSetScalefactor()
	 * @see #unsetScalefactor()
	 * @see #getScalefactor()
	 * @generated
	 */
	void setScalefactor(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getScalefactor <em>Scalefactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScalefactor()
	 * @see #getScalefactor()
	 * @see #setScalefactor(double)
	 * @generated
	 */
	void unsetScalefactor();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getScalefactor <em>Scalefactor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scalefactor</em>' attribute is set.
	 * @see #unsetScalefactor()
	 * @see #getScalefactor()
	 * @see #setScalefactor(double)
	 * @generated
	 */
	boolean isSetScalefactor();

	/**
	 * Returns the value of the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.HorizontalAlignmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das horizonalAlignment-Attribut steuert die Ausrichtung des Texts in Textschreibrichtung. Text kann linksbündig, zentrischund rechtsbündig ausgerichtet werden. Fehlt das Attribut wird zentrisch (=center) angenommen.
	 * 
	 * Soweit die Ausrichtung des Texts in Schreibrichtung durch textlich formulierte Positionierungsregeln bestimmt wird (DesignRule-Objekt), gilt die dort im Text vorgegebene Angabe.
	 * 
	 * Wird die Darstellung eines Präsentationsobjekts beschrieben - erkennbar am featureTypeName des Filter-Objekts - so gilt folgende Sonderfunktionalität: Enthält dieses Objekt eine horizontale Ausrichtung (Attribut "horizontaleAusrichtung"), so überschreibt diese die Angabe im horizontalAlignment-Attribut. Die möglichen Werte sind dabei sinngemäß abzubilden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HorizontalAlignmentType
	 * @see #isSetHorizontalAlignment()
	 * @see #unsetHorizontalAlignment()
	 * @see #setHorizontalAlignment(HorizontalAlignmentType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType3_HorizontalAlignment()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='horizontalAlignment' namespace='##targetNamespace'"
	 * @generated
	 */
	HorizontalAlignmentType getHorizontalAlignment();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Alignment</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HorizontalAlignmentType
	 * @see #isSetHorizontalAlignment()
	 * @see #unsetHorizontalAlignment()
	 * @see #getHorizontalAlignment()
	 * @generated
	 */
	void setHorizontalAlignment(HorizontalAlignmentType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHorizontalAlignment()
	 * @see #getHorizontalAlignment()
	 * @see #setHorizontalAlignment(HorizontalAlignmentType)
	 * @generated
	 */
	void unsetHorizontalAlignment();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getHorizontalAlignment <em>Horizontal Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Horizontal Alignment</em>' attribute is set.
	 * @see #unsetHorizontalAlignment()
	 * @see #getHorizontalAlignment()
	 * @see #setHorizontalAlignment(HorizontalAlignmentType)
	 * @generated
	 */
	boolean isSetHorizontalAlignment();

	/**
	 * Returns the value of the '<em><b>Vertical Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.VerticalAlignmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das verticalAlignment-Attribut steuert die Ausrichtung des Texts senkrecht zur Textschreibrichtung. Text kann unten, auf der Grundlinie, mittig und an der Oberseite ausgerichtet werden. Fehlt das Attribut wird mittig (=half) angenommen.
	 * 
	 * Soweit die Ausrichtung des Texts senkrecht zur Schreibrichtung durch textlich formulierte Positionierungsregeln bestimmt wird (DesignRule-Objekt), gilt die dort im Text vorgegebene Angabe.
	 * 
	 * Wird die Darstellung eines Präsentationsobjekts beschrieben - erkennbar am featureTypeName des Filter-Objekts - so gilt folgende Sonderfunktionalität: Enthält dieses Objekt eine vertikale Ausrichtung (Attribut "vertikaleAusrichtung"), so überschreibt diese die Angabe im verticalAlignment-Attribut. Die möglichen Werte sind dabei sinngemäß abzubilden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Alignment</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.VerticalAlignmentType
	 * @see #isSetVerticalAlignment()
	 * @see #unsetVerticalAlignment()
	 * @see #setVerticalAlignment(VerticalAlignmentType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType3_VerticalAlignment()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='verticalAlignment' namespace='##targetNamespace'"
	 * @generated
	 */
	VerticalAlignmentType getVerticalAlignment();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Alignment</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.VerticalAlignmentType
	 * @see #isSetVerticalAlignment()
	 * @see #unsetVerticalAlignment()
	 * @see #getVerticalAlignment()
	 * @generated
	 */
	void setVerticalAlignment(VerticalAlignmentType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerticalAlignment()
	 * @see #getVerticalAlignment()
	 * @see #setVerticalAlignment(VerticalAlignmentType)
	 * @generated
	 */
	void unsetVerticalAlignment();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getVerticalAlignment <em>Vertical Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical Alignment</em>' attribute is set.
	 * @see #unsetVerticalAlignment()
	 * @see #getVerticalAlignment()
	 * @see #setVerticalAlignment(VerticalAlignmentType)
	 * @generated
	 */
	boolean isSetVerticalAlignment();

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Font der Label-Definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(FontType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType3_Font()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='font' namespace='##targetNamespace'"
	 * @generated
	 */
	FontType getFont();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(FontType value);

	/**
	 * Returns the value of the '<em><b>Text Body Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SolidFill zur Ausgestaltung der Textkörper.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Body Fill</em>' containment reference.
	 * @see #setTextBodyFill(TextBodyFillType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType3_TextBodyFill()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='textBodyFill' namespace='##targetNamespace'"
	 * @generated
	 */
	TextBodyFillType getTextBodyFill();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getTextBodyFill <em>Text Body Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Body Fill</em>' containment reference.
	 * @see #getTextBodyFill()
	 * @generated
	 */
	void setTextBodyFill(TextBodyFillType value);

	/**
	 * Returns the value of the '<em><b>Halo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das anzuwendende Halo-Objekt.
	 * 
	 * Ohne Halo-Objekt findet keine Halo-Freistellung statt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Halo</em>' containment reference.
	 * @see #setHalo(HaloType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getLabelType3_Halo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='halo' namespace='##targetNamespace'"
	 * @generated
	 */
	HaloType getHalo();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3#getHalo <em>Halo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Halo</em>' containment reference.
	 * @see #getHalo()
	 * @generated
	 */
	void setHalo(HaloType value);

} // LabelType3
